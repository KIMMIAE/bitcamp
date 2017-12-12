//Servlet 배치 URL
package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet ({"/step1/Servlet02/*","/servlet02","/ohora"})
public class Servlet02 implements javax.servlet.Servlet {
	
	ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}
	
	 @Override
	public void destroy() {}
	 
	 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 System.out.println("step1.Servlet02.service()");
	}
	 
	 @Override
	public ServletConfig getServletConfig() {
		return this.config;
	}
	 
	 @Override
	public String getServletInfo() {
		return "Servlet02 - 서블릿 배치 URL";
	}
	
}
