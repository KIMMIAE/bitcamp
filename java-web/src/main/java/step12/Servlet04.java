//redirect - 다른 페이지로 요청하라고 응답한다.
package step12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet ("/step12/Servlet04")
public class Servlet04 extends HttpServlet {
	 @Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		 req.setCharacterEncoding("UTF-8");
		 HttpSession session = req.getSession();
		 
		 String age = req.getParameter("age");
		 session.setAttribute("age", age);
		 
		 RequestDispatcher rd = req.getRequestDispatcher("/step12/form3.jsp");
		 rd.forward(req, res);

		 
	}
	
}
