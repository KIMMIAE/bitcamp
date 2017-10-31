// 오버라이딩 규칙
// => 접근법칙
// => 리턴타입
// => 메서드명
// => 파라미터 타입
// => 파라미터명
package bitcamp.java100.ch08.ex7;

public class B2 extends B {
    // 모두 일치
    //void m1(int a, String s) {} //OK!
    //protected  void m1(int a, String s) {} //OK!
    //public void m1(int a, String s) {} //OK!
    // void m1(int x, String y) {}
    
    // 리턴 타입 불일치
    //int m1(int a, String s) {} // 컴파일 오류!
    void m1_1(int a, String s) {}
    void m1(String a, String s) {}
    void m1(String s, int a) {}
    void m1(int a) {}
    

}
