package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.annotation.RequestMappingHandlerMapping;
import java100.app.util.DataSource;

//@WebListener
public class ContextLoaderListener implements ServletContextListener {
	
	public static AnnotationConfigApplicationContext iocContainer;
	public static RequestMappingHandlerMapping handlerMapping;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ContextLoderListener()실행!");
		
		ServletContext webApplicationInfo = sce.getServletContext();
		String configClassName = webApplicationInfo.getInitParameter("contextConfigLocation");
		try {
			Class<?> configClass = Class.forName(configClassName);
		
		iocContainer = new AnnotationConfigApplicationContext(configClass);
		
		handlerMapping = new RequestMappingHandlerMapping(iocContainer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		DataSource ds = iocContainer.getBean(DataSource.class);
		ds.close();
		
	}

}
