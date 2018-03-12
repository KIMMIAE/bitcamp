package java100.app.web;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

import java100.app.domain.Member;
import java100.app.service.MemberService;

@Controller
@RequestMapping("/auth")
@SessionAttributes("loginUser")
public class LoginController {
    
    @Autowired MemberService memberService;
    
    @RequestMapping(value="login", method=RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("menuVisible", false);
        return "auth/loginform";
    }
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(
            String email, 
            String password,
            String saveEmail,
            HttpServletResponse response,
            Model model) {
        
        Member member = memberService.get(email, password);
        
        if (saveEmail != null) {
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("email", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        
        if (member == null) {
            model.addAttribute("loginUser", null);
            model.addAttribute("menuVisible", false);
            return "auth/loginfail"; 
        }
        
        model.addAttribute("loginUser", member);
        
        return "redirect:../score/list";
    }
    
    @RequestMapping(value="facebookLogin")
    public String facebookLogin(
            String accessToken, 
            HttpServletResponse response,
            HttpSession session,
            Model model) {
        
        System.out.println(accessToken);
        
        // 클라이언트가 보낸 액세스 토큰을 가지고 
        // 페이스북 서버에 로그인 사용자 정보를 요청한다.
        RestTemplate restTemplate = new RestTemplate();
        
        try {
            @SuppressWarnings("rawtypes")
            Map result = restTemplate.getForObject(
                    // 요청할 URL 
                    // => URL에 들어갈 값이 있다면 중괄호{} 를 사용하여 지정하라.
                    // => {변수명} 
                    "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}",
                    
                    // 서버에서 받은 값을 어떤 타입의 값으로 리턴할 지 지정하라.
                    Map.class,
                    
                    // URL에 들어갈 값 
                    // => 객체에 값을 담아서 전달하거나, 값을 순서대로 나열한다.
                    // => 객체를 전달한다면 프로퍼티명으로 값을 찾아 삽입한다.
                    // => 값을 나열한다면, 값이 나온 순서대로 삽입한다.
                    accessToken, "id,name,email");
            
            Member member = memberService.get((String)result.get("email"));
            
            if (member == null) {
            	member = new Member();
            	member.setName((String)result.get("name"));
            	member.setEmail((String)result.get("email"));
            	member.setPassword("1111");
            	memberService.add(member);
            }
            model.addAllAttributes("loginuser", member);
            return "redirect:../score/list";
            
        } catch (Exception e) {
            // 액세스 토큰이 무효하다면 예외 발생!
            return "auth/loginfail";
        }
    }
    
    @RequestMapping("logout")
    public String logout(HttpSession session, SessionStatus status) {
        
        // @SessionAttributes에서 관리하는 세션 데이터를 모두 제거한다.
        status.setComplete();
        
        // HttpSession 객체를 무효화시킨다.
        session.invalidate();
        
        return "redirect:login";
    }
    
    
}
