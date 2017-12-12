//Servlet 인터페이스
package step2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet ("/step2/Servlet02")
public class Servlet02 extends GenericServlet {
	 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 System.out.println("step2.Servlet02.service()");
	}
	
}
