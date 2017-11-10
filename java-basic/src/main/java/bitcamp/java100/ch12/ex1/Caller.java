// 인터페이스 사용
package bitcamp.java100.ch12.ex1;

public class Caller {
    
    public static void main(String[] args) {
        
        Protocol obj = new Callee();
        
        // Protocol obj2 = new String(); // 컴파일 오류!
        
        obj.m1();
        obj.m2();
    }
}
