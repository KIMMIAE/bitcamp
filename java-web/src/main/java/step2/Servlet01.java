//Servlet 인터페이스
package step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet ("/step2/Servlet01")
public class Servlet01 extends AbstractServlet {
	 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("step2.Servlet01.service()");
	}
	
}
