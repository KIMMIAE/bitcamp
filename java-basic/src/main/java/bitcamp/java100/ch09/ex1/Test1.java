// 컬렉션(collection) API - 배열 사용하기
package bitcamp.java100.ch09.ex1;

public class Test1 {

    public static void main(String[] args) {
        
        Object[] arr = new Object[10000];
        
        
        int cursor = 0;
        
        arr[cursor++] = new String("홍길동"); // 후위연산자는 먼저 값을 놓고 변수 값을 증가시킴
        arr[cursor++] = new Integer(100);
        arr[cursor++] = 80;
        arr[cursor++] = 70;
        arr[cursor++] = 250;
        arr[cursor++] = 250 / 3f;
        arr[cursor++] = "임꺽정";
        arr[cursor++] = 80;
        arr[cursor++] = 80;
        arr[cursor++] = 80;
        arr[cursor++] = 240;        
        arr[cursor++] = 230 / 3f;
        
        for (int i = 0; i < cursor; i++) {
            System.out.println(arr[i]);
        }
        
    }

}
