// 세션 다루기 - @SessionAtributes 애노테이션 사용
//
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/v03/test07")
@SessionAttributes({"name", "age"})
public class Test07 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v03/test06/m1
    
    //세션 준비하고 값 저장하기
    @RequestMapping(value="/m1")
    public String m1(Model model) {
    	model.addAttribute("name", "홍길동");
    	model.addAttribute("age", 20); // auto-boxing : Integer 객체 저장
    	model.addAttribute("working", true); // auto-boxing : Boolean 객체 저장
    	
    	// 모델에 보관된 값이 ServletRequest에 저장되었는지 확인해보자!
        return "v03/test07/m1"; 
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
    		@ModelAttribute("name") String name, 
    		@ModelAttribute("age") int age) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("name=%s\n", name));
    	buf.append(String.format("age=%d\n", age));
    	
    	// 모델에 보관된 값이 ServletRequest에 저장되었는지 확인해보자!
        return buf.toString(); 
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(
    		@ModelAttribute String name, 
    		@ModelAttribute int age) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("name=%s\n", name));
    	buf.append(String.format("age=%d\n", age));
    	
    	// 모델에 보관된 값이 ServletRequest에 저장되었는지 확인해보자!
        return buf.toString(); 
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@ModelAttribute("working") String working) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("working=%s\n", working));
    	
    	// 모델에 보관된 값이 ServletRequest에 저장되었는지 확인해보자!
        return buf.toString(); 
    }
    
    // 요청 핸들러의 호출이 끝난 후 프론트 컨트롤러는 Model 객체에
    //@SessionAttributes 에서 지정한 값이 있는지 조사한다.
    // => 있다면,
    //          - 그 값을 HttpSession 보관소에 저장한다.
    // => Model 객체에는 없는데, HttpSession 객체에 기존 그 이름으로 보관된 값이 있다면
    //          - 세션 보관소에 기존에 저장된 값을 ServletRequest에 담아준다.
    //            JSP가 쓰라고!
    @RequestMapping(value="/m5")
    public String m5() {
        return "v03/test08/m1"; 
    }
    
}




