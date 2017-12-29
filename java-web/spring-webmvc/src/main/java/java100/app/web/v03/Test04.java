// 요청 핸들러의 파라미터 - @RequestBody II
//
package java100.app.web.v03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v03/test04")
public class Test04 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v02/test18/m1
    
    
    @RequestMapping(value="/m1")
    //@ResponseBody
    public Object m1() {
        return new Member("홍길동", 20, true); 
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    //@ResponseBody
    public String m2() {
        return "Hello, 안녕!"; 
    }
}




