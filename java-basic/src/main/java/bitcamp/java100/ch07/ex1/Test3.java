// 상속(inheritance)
package bitcamp.java100.ch07.ex1;

// 기능확장
// 방법 1) 기존 클래스에 기능을 추가한다. // 주의! 기존 클래스를 건드는 것은 위험하다. 
//          => 기존 소스 코드에 새 코드를 추가하다보면 기존 코드를 건드리게 된다. 
//          => 그래서 가능한 기존 소스를 손대지 않는 것이 유지보수에 좋다.
//
// 방법 2) 새 클래스를 만들어 기존 클래스의 코드를 복사하고 새 기능을 추가한다.
//         => 기존 소스를 손대지 않기 때문에 버그가 발생할 가능성을 줄어든다.
//         => 문제는,
//            - 기존 코드를 복사/붙여넣기 해야 하는 번거로움이 있다.
//            - 기존 코드에 버그가 있을 때, 
//              그 코드를 복사해서 만든 모든 새 코드도 같은 버그를 갖는다.
//              버그를 잡으려면 기존 코드 뿐만 아니라 복사해서 사용한 모든
//              코드를 찾아서 바꿔야 하는 번거로움이 있다.

public class Test3 {

    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        calc.result = 1;
        calc.multiple(10);
        calc.multiple(17);
        calc.divide(3);
        calc.remainder(5);
        
        System.out.println(calc.result);
        

    }

}
