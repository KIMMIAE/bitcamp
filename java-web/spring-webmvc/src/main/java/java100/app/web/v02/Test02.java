package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test02")
public class Test02 {
	
	
	@RequestMapping
	public String m() {
		return "/hello.jsp";
	}

}
