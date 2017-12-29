// 세션 다루기 - @SessionAtributes 애노테이션 사용
//
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({"name", "age"})
public class Test08 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v03/test08/m1
    
    //세션 준비하고 값 저장하기
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(HttpSession session, Model model) {
    	model.addAttribute("name", "홍길동"); // 세션에도 보관된다.
    	model.addAttribute("age", 20); // 세션에도 보관된다.
    	model.addAttribute("working", true); //직접 세션에 보관할 것이다.
    	
    	session.setAttribute("working", true);
    	
        return "v03/test08/m1"; 
    }
    
    @RequestMapping(value="/m2")
    public String m2(HttpSession session) {
    	session.invalidate();
    	
        return "v03/test08/m1"; 
    }
    
    @RequestMapping(value="/m3")
    public String m3(SessionStatus status) {
    	
    	status.setComplete();
    	
        return "v03/test08/m1"; 
    }
    
    @RequestMapping(value="/m4")
    public String m4(HttpSession session, SessionStatus status) {
    	
    	session.invalidate();
    	status.setComplete();
    	
        return "v03/test08/m1"; 
    }
    
}




