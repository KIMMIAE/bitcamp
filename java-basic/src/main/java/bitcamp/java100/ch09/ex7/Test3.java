// 컬렉션 API - HashSet
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test3 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        

        set.add(s1);
        set.add(s2);
        set.add(s3);

        // 집합의 특징을 구현했기 때문에, 같은 인스턴스를 중복해 저장 불가
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        // null 값도 저장할 수 있다.
        set.add(null);
        set.add(null);         // null 값도 중복 저장 불가
        
        System.out.println(set.size());
        
        // 컬렉션에서 객체를 꺼낼 때 저장 순서대로 꺼낼 수 없다.
        String[] arr = new String[set.size()];
        String[] arr2 = set.toArray(arr);
        

        if (arr == arr2) 
            System.out.println("arr == arr2");
        else
            System.out.println("arr!= arr2");
        
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
