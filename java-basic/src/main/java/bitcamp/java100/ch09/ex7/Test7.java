// 컬렉션 API - HashSet
package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test7 {
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
        
        
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("ccc"));
        
        String key = new String("aaa");
        
        System.out.println("aaa" == key);
        System.out.println("aaa".hashCode()); // String 인스턴스의 hashCode
        System.out.println(key.hashCode());
        System.out.println("aaa".equals(key));
        
        System.out.println(map.get(key));
        
        
        
    }
}
