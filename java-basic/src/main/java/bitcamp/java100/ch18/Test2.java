// Re

package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test2 {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = StringWriter.class;
        
        // 1) 클래스 이름 (패키지명 포함)
        
        System.out.println(clazz.getName());
        
        // 2) 클래스 이름만 알아내기
        System.out.println(clazz.getSimpleName()); // 클래스 이름만 알아내고 싶을 때
        
        // 3) 
        System.out.println(clazz.getTypeName());
        
        Class<?> superClass = clazz.getSuperclass();
        
        System.out.printf("수퍼클래스: %s\n", superClass.getName());
    }

}
