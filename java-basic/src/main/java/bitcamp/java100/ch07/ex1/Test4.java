// 상속(inheritance)
package bitcamp.java100.ch07.ex1;

public class Test4 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.result = 1;
        calc.multiple(5);
        
        // 무심코 0으로 나눈다.
        calc.divide(0); // 즉시 실행 오류(RuntimeException)!
        calc.multiple(17);
        
        
        System.out.println(calc.result);
        
    }
}
