// 상속(inheritance)
package bitcamp.java100.ch07.ex2;

public class Test3 {

    public static void main(String[] args) {
        // Calculator의 인스턴스를 생성할 때, 
        // => 수퍼 클래스를 찾아 올라가서 그 클래스에 정의된 인스턴스 변수를 확인하여 만든다.
        CalculatorB calc = new CalculatorB();
        calc.result = 1;
        calc.multiple(10);
        calc.multiple(17);
        calc.divide(3);
        calc.remainder(5);
        
        System.out.println(calc.result);
        

    }

}
