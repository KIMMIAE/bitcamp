// 인터페이스를 정의하는 방법 II
package bitcamp.java100.ch12.ex3;

public interface Protocol2 {
    
    public static final float PI = 3.14159f;
    
    static final int AA = 100;
    
    final int BB = 200;
    
    int CC = 300;
    
    // => 생략한 것은 컴파일러가 자동으로 public static final을 붙인다.
    
    // private int DD = 400; // 컴파일 오류! 왜? 규칙은 공개되야 하니까!

}
