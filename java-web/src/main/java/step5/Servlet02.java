//한글 깨지는 Servlet
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
@WebServlet ("/step5/Servlet02")
public class Servlet02 extends HttpServlet {
	 @Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 
		 
		 res.setContentType("text/plain;charset=UTF-8");
		 PrintWriter out = res.getWriter();
		 out.printf("name: %s\n", req.getParameter("name"));
		 out.println("---------------------------------------");
		 
		 String[] values = req.getParameterValues("name");
		 for (String value : values) {
			 out.printf("name: %s\n", value);
		 }
		 out.println("---------------------------------------");
		 
		 Enumeration<String> names = req.getParameterNames();
		 
		 while (names.hasMoreElements()) {
			 String name = names.nextElement();
			 out.printf("%s: %s\n", name, req.getParameter(name));
		 }
 	}
	
}
