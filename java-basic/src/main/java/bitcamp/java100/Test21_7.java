// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {
 
        
        Console console = System.console();
        
        if ( console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // 에러 출력할 때 알아보기 쉽게 하기 위한 장치 'err'
            System.exit(1); // JVM을 종료한다.
        }
        
        String str = console.readLine("문자열? ");
        
        StringBuffer buf = new StringBuffer();
        buf.append(str);
        
        int len = buf.length() / 2;
        
        for (int left = 0, right = buf.length() - 1; left < len; left++, right--) {
            char ch = buf.charAt(left);
            buf.setCharAt(left, buf.charAt(right));
            buf.setCharAt(right,  ch);

        }   
        
        System.out.printf("입력 문자열: %s\n", str);
        System.out.printf("변경 문자열: %s\n", buf);
    }
}
