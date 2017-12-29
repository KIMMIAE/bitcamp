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
@WebServlet ("/step12/Servlet05")
public class Servlet05 extends HttpServlet {
	 @Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		 req.setCharacterEncoding("UTF-8");
		 HttpSession session = req.getSession();
		 
		 String working = req.getParameter("working");
		 if (working != null) {
		 session.setAttribute("working", working);
		 } else {
			 session.removeAttribute("working");
		 }
		 
		 RequestDispatcher rd = req.getRequestDispatcher("/step12/result.jsp");
		 rd.forward(req, res);
		 
	}
	
}
