package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test4 {

    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Z.class;
        
        Method[] methods = clazz.getMethods();
        
        for (Method m : methods) {
            System.out.println(m.getName());
            
            // 생성자의 파라미터 조회
            
            Parameter[] params = m.getParameters();
            for (Parameter param : params) {
                System.out.printf("    %s:%s\n",
                        param.getName(),
                        param.getType().getName());
                
                
            }
        }
        
        System.out.println("-----------------------------------------");
        
        // 해당 클래스에 선언된 모든 메서드 조회
        // => 수퍼 클래스의 메서드는 포함하지 않는다.
        
        
        methods = clazz.getDeclaredMethods();
        
        for (Method m : methods) {
            System.out.println(m.getName());
            
            // 생성자의 파라미터 조회
            
            Parameter[] params = m.getParameters();
            for (Parameter param : params) {
                System.out.printf("    %s:%s\n",
                        param.getName(),
                        param.getType().getName());
                
                
            }
        }
        
    }

}
