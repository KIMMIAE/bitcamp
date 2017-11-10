// 인터페이스의 구현체를 사용하는 개발자 입장!
package bitcamp.java100.ch12.ex2;

import java.util.Iterator;

public class Caller2 {

    public static void main(String[] args) {
        Array list = new Array();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        Iterator itertor = list.iterator(); // 이터레이터 메소드가 리턴하는 것을 이터레이터 
                                            // 규칙에 따라 만든 어떤 객체의 주소를 리턴함.
        
        while (itertor.hasNext()) {
            System.out.println(itertor.next());
        }

    }

}
