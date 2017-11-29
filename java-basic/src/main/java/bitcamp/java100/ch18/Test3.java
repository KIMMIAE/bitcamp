package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Test3 {

    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Z.class;
        
        Constructor<?>[] constructors = clazz.getConstructors();
        
        for (Constructor<?> con : constructors) {
            System.out.println(con.getName());
            
            // 생성자의 파라미터 조회
            
            Parameter[] params = con.getParameters();
            for (Parameter param : params) {
                System.out.printf("    %s:%s\n",
                        param.getName(),
                        param.getType().getName());
                
                
            }
        }
        
        System.out.println("-----------------------------------------");
        
        constructors = clazz.getDeclaredConstructors();
        
        for (Constructor<?> con : constructors) {
            System.out.println(con.getName());
            
            // 생성자의 파라미터 조회
            
            Parameter[] params = con.getParameters();
            for (Parameter param : params) {
                System.out.printf("    %s:%s\n",
                        param.getName(),
                        param.getType().getName());
                
                
            }
        }
        
    }

}
