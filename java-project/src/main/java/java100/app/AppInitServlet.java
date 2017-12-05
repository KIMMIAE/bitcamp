//: ## ver 49
//: 
//:   
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@WebServlet(urlPatterns="/init", name = "AppInitServlet", loadOnStartup = 1)
@Configuration
// @ComponentScan(basePackages = "java100.app") //배열 하나일 땐 중괄호 생략 가능!
// @ComponentScan(value = "java100.app") => 이것도 가능 value = basePackages
@ComponentScan("java100.app") // 최종적으로 우리가 보게 되는 간결한 코드
public class AppInitServlet implements Servlet {

	ServletConfig servletConfig;

	// Spring IoC 컨테이너 객체
	public static AnnotationConfigApplicationContext IocContainer;

	// 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서
	// 이 메서드가 리턴한 객체를 꼭 컨테이너에 보관해달라고 표시!
	@Bean // 실무에선 Bean 지정할 일 없음. 여러 개 쓰지 않는 이상.
	DataSource getDataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/studydb");
		ds.setUsername("study");
		ds.setPassword("1111");
		return ds;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("AppInitServlet.init()");
		this.servletConfig = config;

		IocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()");

	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
		DataSource ds = IocContainer.getBean(DataSource.class);
		ds.close();

	}

	@Override
	public ServletConfig getServletConfig() {

		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "이 서불릿은 다른 서불릿을 위한 스프링 IoC 컨테이너를 준비한다.";
	}

}
