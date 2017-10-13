package bitcamp.java100;

public class Test17_5 {  


    static String m1() {
        return "hello";
    }
    
    static int m2() {
        return 100;
    }
    
    
    static boolean m3() {
        return true;
    }
    
    // static int m4() {return "hello";} // 컴파일 오류!
    // static int m5( ) {} // 컴파일 오류!
    
    static int m6() {
        return 100;
        // int a = 100; // 컴파일 오류!
        // a++;         // 컴파일 오류!
    }
    
    
    
    public static void main(String[] args) { 
        
        
        String v = m1();
        System.out.println(v); // => 가능하지만 아래보단 덜 쓰임.
        
        System.out.println(m1()); // => 실무에서 쓰이는 방식. 코드의 가독성을 좋게 함.
        
        m1(); // 반환 값을 다루지 않아도 되지만, 반환 값을 저장하지 않으면 값은 버려진다.
        
        // String s = m2(); // 컴파일 오류!

        
        
    }
    }

