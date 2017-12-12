//POST 요청으로 보낸 한글이 깨지는 이유와 해결책

package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet ("/step5/Servlet05")
public class Servlet05 extends HttpServlet {
	 @Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 
		 // 이 서블릿을 실행 하기 전에 필터에서 이미 한글 처리를 했기 때문에 다음 메서드를 호출하지 않아도 
		 // 한글이 정상적으로 String 객체로 변환될 것이다.
		 //req.setCharacterEncoding("UTF-8");
		 
		 res.setContentType("text/plain;charset=UTF-8");
		 PrintWriter out = res.getWriter();
		 
		 Enumeration<String> names = req.getParameterNames();
		 while (names.hasMoreElements()) {
			 String name = names.nextElement();
			 out.printf("%s: %s\n", name, req.getParameter(name));
		 }
 	}
	
}
