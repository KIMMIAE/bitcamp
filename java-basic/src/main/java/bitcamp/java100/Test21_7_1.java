// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_7_1 {

    static Console console = System.console();

    static void prepareConsole() {
        console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); 
        }
    }
    
    
    
    public static void main(String[] args) {
 
            prepareConsole();
            
          //  String str = inputString();
         //   String str2 = reverseString(str);
       

        
      //  str = console.readLine("문자열? ");
     //   System.out.printf("입력한 값: %s\n ", str);
      //  for (int i = str.length() - 1 ; i >= 0 ; i--) {
      //      System.out.print(str.charAt(i));
           }
    }
//}
