package bitcamp.java100.ch21.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);


		String[] names = appCtx.getBeanDefinitionNames();
		for (String name : names) {
			System.out.printf("%s => %s\n", name, appCtx.getBean(name).getClass().getName());
		}
		System.out.println("--------------------------------------");
		
		Front obj = (Front) appCtx.getBean(Front.class);
		obj.test("홍길동");
		System.out.println("--------------------------------------");
		
		System.out.println("--------------------------------------");
		
		obj.test(null);
		
		
	}
}
