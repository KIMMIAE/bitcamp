package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(assignableTypes={Test12.class,Test11.class})
public class Test12ControllerAdvice {
	
	
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

}
