// 캡슐화 - 같은 패키지의 클래스가 멤버에 접근할 경우
package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test2 {

    public static void main(String[] args) {

        // A.v1 = 100; // 접근 불가

        // A.v2 = 200;

        // A.v3 = 300;

        A.v4 = 400;

    }

}
