package bitcamp.java100;

//java.lang 패키지에 들어있는 클래스들은 자바 프로그래밍에서 가장 많이 사용하는 
//핵심 클래스들이기 때문에 import를 따로 선언하지 않아도 자동으로 찾는다.
// import java.lang.String; // 생략하라!

// 주의! java.lang패키지만 해당된다.

public class Test20_1 {

    
    public static void main(String[] args) {

        
        int i = 10;
        
        Integer i2 = new Integer(10);
        
        int i3 = i2.intValue();
        
        float f1 = i2.floatValue();
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        int value = Integer.parseInt("2345");
        System.out.println(value + 100);
        
        System.out.println(Integer.toBinaryString(44032));
        System.out.println(Integer.toOctalString(44032));
        System.out.println(Integer.toHexString(44032));

    }
    
}


