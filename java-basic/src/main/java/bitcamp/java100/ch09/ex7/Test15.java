// 컬렉션 API - HashMap
package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test15 {
    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }
        
    }

    public static void main(String[] args) {
        
        // key-value 한 쌍으로 이루어진 값을 보관할 때 사용한다.
        HashMap<String,Contact> map = new HashMap<>();

        Contact c1 = new Contact("홍길동", "h@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동2", "h@test.com", "1111-1111");
        Contact c3 = new Contact("홍길동3", "h@test.com", "1111-1111");
        
        map.put("aaa",c1);
        map.put("bbb",c2);
        map.put("ccc",c3);
       
        Iterator<Contact> iterator = map.values().iterator(); // 현업에선 이렇게 씀.
                                                              // 한 번 쓰고 말 변수는 따로 선언 안하는 게 편해서
        /*
        // 공부할 때(이해하기 쉬우려고)쓴 방식
        Collection<Contact> values = map.values();
        
        Iterator<Contact> iterator = values.iterator();
        */
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
        
        
    }
}
