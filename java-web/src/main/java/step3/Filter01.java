package step3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(urlPatterns="/step3/Servlet01")
public class Filter01 implements javax.servlet.Filter {
	
	FilterConfig config;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter01.init()");
		this.config = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter01.dofilter() - before");
		chain.doFilter(request, response);
		System.out.println("Filter01.dofilter() - after");
		//서비스 메서드 실행한 다음에 해야될 게 있으면 여기에 
		
	}

	@Override
	public void destroy() {
		System.out.println("Filter01.destroy()");
		
	}
	

}
