package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test05")
public class Test05 {
	
	
	@RequestMapping
	public String m1() {
		System.out.println("m1()");
		return "/hello.jsp";
	}
	
	@RequestMapping(params="menu")
	public String m2() {
		System.out.println("m2()");
		return "/hello.jsp";
	}
	
	@RequestMapping(params="command")
	public String m3() {
		System.out.println("m3()");
		return "/hello.jsp";
	}
	
	@RequestMapping(params= {"menu","command"})
	public String m4() {
		System.out.println("m4()");
		return "/hello.jsp";
	}
	


}
