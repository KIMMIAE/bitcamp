package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v02/test04")
public class Test04 {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		System.out.println("get()");
		return "/hello.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String post() {
		System.out.println("post()");
		return "/hello.jsp";
	}
	
	@RequestMapping(value="m1", method=RequestMethod.GET)
	public String m1Get() {
		System.out.println("m1Get()");
		return "/hello.jsp";
	}
	
	@RequestMapping(value="/m1", method=RequestMethod.POST)
	public String m1Post() {
		System.out.println("m1Post()");
		return "/hello.jsp";
	}
	


}
