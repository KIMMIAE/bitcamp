package bitcamp.java100.ch07.ex2;

public class Calculator {
    int result;
    
    void multiple (int value) {
        this.result *= value;
    } 
    
   // void divide(int value) { 
   //     this.result /= value;
   // }
    
// 여기에서 코드를 변경하면, 그 서브 클래스에서 변경된 내용이 그대로 반영된다.    
    void divide(int value) { 
        if (value == 0) {
            System.err.print("0으로 나누면 안됩니다!");
            return;
        }
        this.result /= value;
    }
}
