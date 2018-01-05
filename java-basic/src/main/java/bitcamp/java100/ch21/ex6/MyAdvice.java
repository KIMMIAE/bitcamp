package bitcamp.java100.ch21.ex6;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	
	@Before("execution(* bitcamp.java100.ch21.ex6.X.*(..)) and args(name)")
	public void doBefore(String name) {
		System.out.printf("MyAdvice.doBefore(): %s\n", name);
	}

	public void doAfter() {
		System.out.println("MyAdvice.doAfter()");
	}
	
	@AfterReturning(value="execution(* bitcamp.java100.ch21.ex6.X.*(..))",
			returning="returnValue")
	public void doAfterReturning(Object returnValue) {
		System.out.printf("MyAdvice.doAfterReturning(): %s\n", returnValue);
	}
	
	@AfterThrowing(value="execution(* bitcamp.java100.ch21.ex6.X.*(..))", throwing="error")
	public void doAfterThrowing(Exception error) {
		System.out.printf("MyAdvice.doAfterThrowing(): %s\n", error.getMessage());
	}
	
	public void doAround() {
		System.out.println("MyAdvice.doAround()");
	}
}
