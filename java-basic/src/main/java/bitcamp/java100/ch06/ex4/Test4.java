// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 4단계 : 클래스 분리 
public class Test4 {
    
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 = ? 
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divide(2);
        
        System.out.println(Calculator1.result);
        
    }

}
