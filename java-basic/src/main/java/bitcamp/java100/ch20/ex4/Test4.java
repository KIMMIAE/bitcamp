package bitcamp.java100.ch20.ex4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex4/application-context4.xml");
        
        System.out.println(appCtx.getBean("c1"));
        
        
        
        
        
        
    }

}
