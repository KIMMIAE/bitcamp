// 예외의 종류 : RuntimeException 계열 예외
package bitcamp.java100.ch13.ex2;

public class Test2 {

    public static void main(String[] args) {
        
        try {
            System.out.printf("%d / %d = %d\n", 20, 0, 20 / 0);
        }catch (RuntimeException e) {
        System.out.println("나누기 실행 중 오류 발생!");
        //(예외는 두 가지 뿐임. try... catch의 사용을 강제하는 예외와 강제하지 않는 예외 )
        //1) RuntimeException (try... catch의 사용을 강제함) 
        //2) Error (강제하진 x) 
        }
        }

}
