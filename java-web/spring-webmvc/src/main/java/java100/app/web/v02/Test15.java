package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test15")
public class Test15 {

	@RequestMapping("/board/{no}")
	public String m1(@PathVariable("no") int no) {
		System.out.println(no);
		System.out.println("-------------------------");
		return "/hello.jsp";
	}
	
	@RequestMapping("/category/{catno}/product/{prodno}")
	public String m2(@PathVariable("catno") int catno,
			@PathVariable("prodno") int prodno) {
		System.out.println(catno);
		System.out.println(prodno);
		System.out.println("-----------------------------");
		return "/hello.jsp";
	}
	
	@RequestMapping("/category2/{catno}/product2/{prodno}")
	public String m3(@PathVariable int catno,
			@PathVariable int prodno) {
		System.out.println(catno);
		System.out.println(prodno);
		System.out.println("-----------------------------");
		return "/hello.jsp";
	}

	@RequestMapping("/software/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d+}{ext:\\.[a-z]+}")
	public String m4(
			@PathVariable String name,
			@PathVariable String version,
			@PathVariable String ext) {
		System.out.println(name);
		System.out.println(version);
		System.out.println(ext);
		System.out.println("-----------------------------");
		return "/hello.jsp";
	}

	
	
}
