package bitcamp.java100.ch07.ex2;

public class CalculatorB extends Calculator {
    
    // Calculator 코드는 사용하는 시점에 해당 클래스를 찾아서 볼 것이기 때문에
    // 여기에 복사하지 않는다.
    // 그냥 추가 기능만 정의한다.
    void remainder(int value) {
        this.result %= value;
    }
    
}
