package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test13")
public class Test13 {

	@RequestMapping
	public String fileUpload(String name, int age, boolean working, MultipartFile photo) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(working);
		System.out.println(photo.getOriginalFilename());

		
		System.out.println("----------------------------");

		return "/hello.jsp";
	}
	
}
