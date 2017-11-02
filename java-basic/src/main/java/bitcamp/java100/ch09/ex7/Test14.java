// 컬렉션 API - Iterator
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("홍길동");
        set.add("임꺽정");
        set.add("유관순");
        
        Iterator<String> iterator = set.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
