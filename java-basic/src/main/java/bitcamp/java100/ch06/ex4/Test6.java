// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 6단계 : 인스턴스 변수의 활용
public class Test6 {
    
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 = ? 
        // 3 * 6 - 5 + 11 /2 = ?
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        // 각 식의 계산 결과를 개별적으로 관리하기 위해
        // result 변수가 들어 있는 인스턴스를 준비한다.
        
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        
        // 첫 번째 식 계산: 2 + 5 * 3 - 7 = ? 
        Calculator2.plus(c1, 2);
        Calculator2.plus(c1, 5);
        Calculator2.multiple(c1, 3);
        Calculator2.minus(c1, 7);
        Calculator2.divide(c1, 2);
        
        System.out.println(c1.result);
        
        // 두 번째 식 계산: 3 * 6 - 5 + 11 /2 = ?
        Calculator2.plus(c2, 3);
        Calculator2.multiple(c2, 6);
        Calculator2.minus(c2, 5);
        Calculator2.plus(c2, 11);
        Calculator2.divide(c2, 2);
        System.out.println(c2.result);
        
    }

}
