//redirect - 다른 페이지로 요청하라고 응답한다.
package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet ("/step12/Servlet06")
public class Servlet06 extends HttpServlet {
	 @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		 HttpSession session = req.getSession();
		 session.invalidate();
		 
		 res.setContentType("text/plain;charset=UTF-8");
		 PrintWriter out = res.getWriter();
		 out.println("세션을 무효화했습니다.");
		 
	}
	
}
