//Servlet 인터페이스
package step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet ("/step2/Servlet05")
public class Servlet05 extends HttpServlet {
	 @Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.printf("클라이언트IP: %s\n", req.getRemoteAddr());
		System.out.printf("클라이언트 포트: %d\n", req.getRemotePort());
		System.out.printf("URL: %s\n", req.getRequestURL());
		System.out.printf("URI: %s\n", req.getRequestURI());
		System.out.printf("servlet path: %s\n", req.getServletPath());
		System.out.printf("path info: %s\n", req.getPathInfo());
		System.out.printf("query string: %s\n", req.getQueryString());
	}
	
}
