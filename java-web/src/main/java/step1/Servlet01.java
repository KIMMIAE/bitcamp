//Servlet 인터페이스
package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet ("/step1/Servlet01")
public class Servlet01 implements javax.servlet.Servlet {
	
	ServletConfig config;
	
	public Servlet01() {
		System.out.println("step1.Servlet01.Servlet01()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("step1.Servlet01.init()");
		
	}
	
	 @Override
	public void destroy() {

		 System.out.println("step1.Servlet01.destroy()");
	}
	 
	 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("step1.Servlet01.service()");
	}
	 
	 @Override
	public ServletConfig getServletConfig() {
		 System.out.println("step1.Servlet01.getServletConfig()");
		return this.config;
	}
	 
	 @Override
	public String getServletInfo() {
		 System.out.println("step1.Servlet01.getServletInfo()");
		return "Servlet01 - 서블릿 인터페이스와 메서드들";
	}
	
}
