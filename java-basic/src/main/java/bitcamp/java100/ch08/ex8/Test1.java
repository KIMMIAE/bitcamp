// 다형성 - 오버로딩
// => 파라미터의 개수나 타입, 순서가 다르더라도
//    같은 기능을 수행하는 메서드에 대해
//    같은 이름을 부여함으로써
//    개발자가 그 기능에 대해 같은 이름의 메서드를 사용할 수 있도록
//    일관성을 제공하는 문법이다.
package bitcamp.java100.ch08.ex8;

public class Test1 {
    
    static int divide (int a, int b) {
        return a / b;
    }
    
    static float divide (float a, float b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        System.out.println(divide(7, 2));
        System.out.println(divide(7f, 2f));
        
        System.out.println(divide(7, 2f));
        System.out.println(divide(7f, 2));
        
        //System.out.println(divide("7", "2")); // 컴파일 오류!

    }

}
