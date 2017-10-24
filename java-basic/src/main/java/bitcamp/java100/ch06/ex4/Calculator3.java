package bitcamp.java100.ch06.ex4;

public class Calculator3 {
    int result;
    
    // 인스턴스 멤버를 보다 쉽게 다루기 위해 인스턴스 메서드로 전환한다.
    void plus(int value) {this.result += value;}
    void minus(int value) {this.result -= value;}
    void multiple(int value) {this.result *= value;}
    void divide(int value) {this.result /= value;}
}
