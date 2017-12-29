// 요청 핸들러의 파라미터 - @RequestBody II
//
package java100.app.web.v03;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/v03/test05")
public class Test05 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v03/test05/m1
    
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m1(HttpServletResponse response) {
    	response.addCookie(new Cookie("name", "hongkildong"));
    	response.addCookie(new Cookie("age", "20"));
    	
        return "쿠키를 보냈습니다."; 
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
    		@CookieValue("name") String name,
    		@CookieValue("age") int age) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("name=%s\n", name));
    	buf.append(String.format("age=%d\n", age));
    	
    	
        return buf.toString(); 
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(
    		@CookieValue String name,
    		@CookieValue int age) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("name=%s\n", name));
    	buf.append(String.format("age=%d\n", age));
    	
    	
        return buf.toString(); 
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@CookieValue String working) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("working=%s\n", working));
    	
    	
        return buf.toString(); 
        
        //=> 실행오류 발생! 
        //   이유?
        //   쿠키를 안 받아서. (오류 문구 : Missing cookie 'working' for method parameter of type String)
    }
    
    @RequestMapping(value="/m5", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m5(@CookieValue(required=false) String working) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("working=%s\n", working));
    	
    	
        return buf.toString(); 
    }
    
    
    @RequestMapping(value="/m6", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m6(@CookieValue(defaultValue="true") String working) {
    	
    	StringBuffer buf = new StringBuffer();
    	buf.append(String.format("working=%s\n", working));
    	
    	
        return buf.toString(); 
    }
}




