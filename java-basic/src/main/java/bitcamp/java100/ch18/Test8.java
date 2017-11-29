//리플렉션 API
package bitcamp.java100.ch18;

import java.lang.reflect.Method;

public class Test8 {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = X.class;
        
        //static 메서드 호출
        
        Method m = clazz.getMethod("m2");
        
        // => 스태틱 메서드이기 때문에 첫 번째 파라미터는 null
        // => m2()를 호출하기 때문에 값을 넘길 필요가 없다.
        //
        m.invoke(null);
        
        
        // => int 값을 받는 m2() 스태틱 메서드 호출
        clazz.getMethod("m2", int.class).invoke(null, 100);
        
        
        // 인스턴스 메서드 호출
        // => 인스턴스 메서드를 호출할 떄 인스턴스 주소를 넘기지 않으면 
        // NullPointException 예외가 발생한다. 
        //clazz.getMethod("m").invoke(null);
        X obj = new X();
        clazz.getMethod("m").invoke(obj);
        clazz.getMethod("m", int.class).invoke(obj, 100);
        clazz.getMethod("m", int.class, String.class).invoke(obj, 100, "홍길동");        
        
    }

}
