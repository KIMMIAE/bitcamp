// 요청 핸들러의 파라미터 - @RequestBody II
//
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    // 테스트 방법:
	//http://localhost:9999/spring-webmvc/app/v02/test18/m1
    
    @RequestMapping("/m1")
    public String m1() {
    	
        return "v03/test01/m1";
    }
    
    @RequestMapping("/m2")
    public void m2() {
    	System.out.println("Test01.m2()...");
    }
    
    @RequestMapping("/m3")
    public View m3() {
    	System.out.println("Test01.m3()...");
    	
    	View view = new InternalResourceView("v03/test01/m3.jsp");
    	return view;
    }
}




