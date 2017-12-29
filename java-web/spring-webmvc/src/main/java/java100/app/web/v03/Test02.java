// 요청 핸들러의 파라미터 - @RequestBody II
//
package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v02/test18/m1
    
    @RequestMapping("/m1")
    @ResponseBody
    public String m1() {
    	
        return "hello";
    }
    
    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {
    	
    	
    	response.setContentType("text/plain;charset=UTF-8"); // => 안됨
        
    	response.setHeader("Content-Type", "text/plain;charset=UTF-8");
    	return "한글!";
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3() {
    	return "한글!";
    }
    
    @RequestMapping(value="/m4")
    //@ResponseBody // HttpEntity나 ResponseEntity 객체를 리턴할 때는 
                  // 프론트 콘트롤러가 콘텐츠임을 알 수 있기 때문에
                  // @ResponseBody을 붙일 필요가 없다.
    public HttpEntity<String> m4() {
        
        // 클라이언트에 보낼 데이터에 대한 부가 정보를 설정한다.
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        // 클라이언트로 보낼 콘텐츠를 담을 객체를 준비한다.
        HttpEntity<String> entity = new HttpEntity<>("한글!", headers);
        
        return entity; 
    }

    @RequestMapping(value="/m5")
    //@ResponseBody // HttpEntity나 ResponseEntity 객체를 리턴할 때는 
                  // 프론트 콘트롤러가 콘텐츠임을 알 수 있기 때문에
                  // @ResponseBody을 붙일 필요가 없다.
    public HttpEntity<String> m5() {
        
        // 클라이언트에 보낼 데이터에 대한 부가 정보를 설정한다.
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        // 클라이언트로 보낼 콘텐츠를 담을 객체를 준비한다.
        ResponseEntity<String> entity = new ResponseEntity<>("한글!", headers, HttpStatus.OK);
        
        return entity; 
    }
    
    
    	
    
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
        return new Member("홍길동", 20, true); 
    }
}




