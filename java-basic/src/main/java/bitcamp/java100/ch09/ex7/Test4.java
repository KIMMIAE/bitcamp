// 컬렉션 API - HashSet
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test4 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        

        
        // 강조!
        // HashSet은 같은 객체를 중복저장하지 않는다고 헸다!
        // => 같은 객체란
        //    - 주소가 같은 것.
        //    - hash 값이 같은 것. hashCode()의 리턴 값이 같은 것!
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        

        set.add(s1);
        set.add(s2);
        set.add(s3);

        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
      
        System.out.println(s1 == s4); // false
        System.out.println(s1 == s5); // false 
        System.out.println(s4 == s5); // false
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equals(s5)); // false 
        System.out.println(s4.equals(s5)); // false
        
        
        set.add(s4);
        set.add(s5);
        
        System.out.println(set.size());
        
        // 컬렉션에서 객체를 꺼낼 때 저장 순서대로 꺼낼 수 없다.
        String[] arr = new String[set.size()];
        set.toArray(arr);
        

        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
        
    }
}
