// 패키지 멤버 클래스 사용

package bitcamp.java100.ch10.ex1;

import javax.print.attribute.standard.MediaSize.Other;

public class Test1 {

    public static void main(String[] args) {
        A obj = new A();
        
        bitcamp.java100.ch10.ex1.other.B obj2 = new
        bitcamp.java100.ch10.ex1.other.B();
        
        //other.B obj3 = new other.B();// 컴파일 오류!
        
        //C obj4 = new C(); // 나중에 C 클래스 수정
        
        //bitcamp.java100.ch10.ex1.other.D obj5 = 
        //        new bitcamp.java100.ch10.ex1.other.D(); // 컴파일 오류!
        
        F obj6 = new F();
        G obj7 = new G();
        
    }

}
