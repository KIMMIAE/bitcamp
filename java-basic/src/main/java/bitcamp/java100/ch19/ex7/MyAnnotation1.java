package bitcamp.java100.ch19.ex7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    
    String values();
    String values2() default "aaaa";
    int values3() default 100;
}
