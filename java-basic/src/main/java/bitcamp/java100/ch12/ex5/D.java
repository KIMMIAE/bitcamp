package bitcamp.java100.ch12.ex5;

// 인터페이스 다중 상속 가능한 이유
// => 메서드가 구현된 상태가 아니기 때문에
// 어떤 메서드를 상속 받아도 상관 없다.
public interface D extends B, C {
    void m4();

}
