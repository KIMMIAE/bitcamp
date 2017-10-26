// 상속(inheritance)
package bitcamp.java100.ch07.ex2;

// 상속으로 기능 확장하기
// - 상속을 이용하면 기존의 코드를 손대지 않고 기능을 확장할 수 있다.
// - 기존의 기능을 복사할 필요도 없다.
// - 단지 기존 코드의 링크 정보를 기술한 다음에
//   새 기능을 추가하면 된다.
// - 이때 상속을 해주는 클래스를 "수퍼(".....

public class Test2 {

    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        
        calc.plus(10); // 현재 클래스(CalculatorA)에 있다.
        calc.plus(20); // 현재 클래스(CalculatorA)에 있다.
        calc.minus(7); // 현재 클래스(CalculatorA)에 있다.
        calc.multiple(2); // 수퍼 클래스(Calculator)에서 찾았다.
        calc.divide(3);  // 수퍼 클래스(Calculator)에서 찾았다.
        
        System.out.println(calc.result);
        

    }

}

// Calculator의 인스턴스를 만드는 과정
// 1) Calculator가 참조하는 수퍼 클래스가 있다면
//    그 클래스의 