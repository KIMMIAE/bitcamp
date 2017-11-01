// 컬렉션 API - HashSet
package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test8 {
    
    static class Mykey {
        String id;
        String pwd;
        
        public Mykey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }
    }
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
        HashMap<Mykey,Contact> map = new HashMap<>();

        Contact c1 = new Contact("홍길동", "h@test.com", "1111-1111");
        Mykey k1 = new Mykey("aaaaa", "11111");

        map.put(k1,c1);

        
        System.out.println(map.get(k1));
        
        // 내용이 같은 다른 Mykey 객체를 사용한다면?
        
        Mykey k2 = new Mykey("aaaaa", "11111");
        System.out.println(map.get(k2)); 
        
        // Mykey 객체를 가지고 값을 찾을 때 
        // hashCode()의 리턴 값이 같고,
        // equals()의 리턴 값이 true인
        // 그 key로 저장된 값을 찾아 리턴한다.
        // 
        // 그런데 Mykey 클래스는 hashCode()와 equals()를 오버라이딩 하지 않았다.
        // 즉 Object의 메서드를 호출하는 것이다.
        // Object에 정의된 hashCode()는 내용물에 상관없이 인스턴스가 다르면
        // 다른 해시값을 리턴하게 만들어져있다.
        // 또한 equals()도 내용물에 상관없이 인스턴스가 다르면 false를 리턴하게
        // 프로그램 되어있다.
        
        // 예제 Test9.jaca를 보자

        

        
        
    }
}
