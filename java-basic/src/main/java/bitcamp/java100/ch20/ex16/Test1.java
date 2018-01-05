package bitcamp.java100.ch20.ex16;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = (Car) appCtx.getBean("tico");
		System.out.println(car);

		System.out.println("--------------------------------------");
		String[] names = appCtx.getBeanDefinitionNames();
		for (String name : names) {
			System.out.printf("%s => %s\n", name, appCtx.getBean(name));
		}
	}
}
