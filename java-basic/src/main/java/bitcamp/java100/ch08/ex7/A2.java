package bitcamp.java100.ch08.ex7;

public class A2 extends A {
    public void test1() {
        m4(); // 상속받은 public 사용 가능!
        m3(); // 서브 클래스에서 상속 받은 protected 멤버 사용 가능!
        m2(); // 같은 패키지에서 상속받은 (default) 멤버 사용 가능!
        //m1(); // private 멤버는 오직 그 클래스만 사용 가능하다. 컴파일 오류!
    }
    
    //A 클래스의 m1()을 오버라이딩 하는 것이 아니다. 
    //그냥 B 클래스의 새로 추가한 메서드이다.
    //이유? private 멤버는 오직 그 안에서만 사용할 수 있기 때문.
    
    private void m1() {
        System.out.println("B.m1()");
    }

    // 수퍼 클래스 A의 m2() 메서드를 오버라이딩한다.
    @Override
    void m2() {}

    // 수퍼 클래스 A의 m3() 메서드를 오버라이딩한다.
    @Override
    protected void m3() {}
    
    // 수퍼 클래스 A의 m4() 메서드를 오버라이딩한다.
    @Override
    public void m4() {}

}
