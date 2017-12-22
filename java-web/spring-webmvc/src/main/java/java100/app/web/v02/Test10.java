package java100.app.web.v02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test10")
public class Test10 {
	
	
	@RequestMapping("m1")
	public String m1() {
		return "/hello.jsp";
	}
	
	@RequestMapping("m2")
	public String m2(HttpServletRequest request) {
		
		return "/hello.jsp";
	}
	
	@RequestMapping("m3")
	public String m3(HttpServletResponse response) {
		
		return "/hello.jsp";
	}

}
