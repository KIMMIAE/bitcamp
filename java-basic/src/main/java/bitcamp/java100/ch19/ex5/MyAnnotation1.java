package bitcamp.java100.ch19.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    
    String[] name();  //진짜 메서드는 아니라서 (int a) 를 받을 순 없음
    int[] age();

}
