package java100.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.control.PageController;
import java100.app.listener.ContextLoaderListener;

@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageControllerPath = request.getServletPath().replace(".do", "");
		
		PageController pageController = 
				(PageController)ContextLoaderListener.iocContainer.getBean(pageControllerPath);
		
		if (pageController == null) {
			throw new ServletException("해당 서블릿을 찾을 수 없습니다.");
		}

		try {
		String viewName = pageController.service(request, response);
		
		if (viewName.startsWith("redirect:")) {
			response.sendRedirect(viewName.substring(9));
			return;
		}else {
	        response.setContentType("text/html;charset=UTF-8");
	        RequestDispatcher rd = request.getRequestDispatcher(viewName);
			rd.include(request, response);
		}
	}catch (Exception e) {
		throw new ServletException(e);
		
	}
	}
}
