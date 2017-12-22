package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v02/test11")
public class Test11 {
	
	
	@RequestMapping("m1")
	public String m1(@RequestParam("name") String name) {
		System.out.println(name);
		return "/hello.jsp";
	}

	@RequestMapping("m2")
	public String m2(
			@RequestParam(value="name", required=false) String name) {
		System.out.println(name);
		return "/hello.jsp";
	}
	
	@RequestMapping("m3")
	public String m3(
			@RequestParam(value="name", defaultValue="우헤헤") String name) {
		System.out.println(name);
		return "/hello.jsp";
	}

	@RequestMapping("m4")
	public String m4(
			String name) {
		System.out.println(name);
		return "/hello.jsp";
	}

	
}
