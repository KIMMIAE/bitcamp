// 컬렉션 API - Hashmap 값 꺼내기 II
package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Set;

public class Test10 {
    
    static class Mykey {
        String id;
        String pwd;
        


        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Mykey other = (Mykey) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (pwd == null) {
                if (other.pwd != null)
                    return false;
            } else if (!pwd.equals(other.pwd))
                return false;
            return true;
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
        HashMap<String,Contact> map = new HashMap<>();

        map.put("c01", new Contact("홍길동", "h@test.com", "1111-1111"));
        map.put("c02", new Contact("홍길동", "h@test.com", "1111-1111"));
        map.put("c03", new Contact("홍길동", "h@test.com", "1111-1111"));
        map.put("c04", new Contact("홍길동", "h@test.com", "1111-1111"));
        map.put("c05", new Contact("홍길동", "h@test.com", "1111-1111"));
        
        
        
        Set<String> keySet = map.keySet();
        
        String[] keyList = new String[keySet.size()];
        keySet.toArray(keyList);
        
        for (String key : keyList) {
            System.out.printf("%s=%s\n", key, map.get(key).toString());
        }
        
        
    }
}
