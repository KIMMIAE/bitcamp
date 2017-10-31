// 다형성 - 오버라이딩할 때 접근 제어의 확장 및 축소
package bitcamp.java100.ch08.ex7;

public class A3 extends A {
    
    //접근 범위를 확장하기
    protected void m2() {} // OK!
    
    //public void m2() {} // OK!
    
    public void m3() {} // OK!
    
    
    //접근 범위 축소
    //private void m2() {} // 컴파일 오류!
    
    
    //void m3() {} // 컴파일 오류!
    
    //protected void m4() {} // 컴파일 오류!
    
    //void m4() {}
    
    

}
