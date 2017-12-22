package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {

	@RequestMapping("m1")
	public String m1(String name, int age, boolean working, float height) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(working);
		System.out.println(height);
		System.out.println("----------------------------");

		return "/hello.jsp";
	}

	@RequestMapping("m2")
	public String m2(java.util.Date birthDay) {
		System.out.println(birthDay);
		System.out.println("----------------------------");

		return "/hello.jsp";
	}

	/*
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		System.out.println("initBinder");
		// 문자열을 날짜 객체로 만들어줄 도구를 준비한다.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false); // 날짜 형식을 엄격하게 검사하라!
		// 스프링에서 제공하는 문자열을 날짜 객체로 변환시켜주는
		// 커스텀 에디터를 준비하여
		// WebDataBinder에 등록한다.
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
    */
	
}
