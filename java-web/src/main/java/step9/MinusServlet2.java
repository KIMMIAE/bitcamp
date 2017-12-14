//GET POST 요청 처리하기
package step9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet ("/step9/MinusServlet")
public class MinusServlet2 extends HttpServlet {
	 @Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		 res.setContentType("text/plain;charset=UTF-8");
		 PrintWriter out = res.getWriter();
		 
		 int a = Integer.parseInt(req.getParameter("a"));
		 int b = Integer.parseInt(req.getParameter("b"));
		 
		 out.printf("%d - %d = %d\n", a, b, a - b);
		 
	}
	
}
