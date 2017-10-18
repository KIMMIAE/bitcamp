package bitcamp.java100;

import java.io.Console;

public class Test21_2 {
    public static void main(String[] args) {
        
        Console console = System.console();
        
        if ( console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // 에러 출력할 때 알아보기 쉽게 하기 위한 장치 'err'
            System.exit(1); // JVM을 종료한다.
        }

            String line = console.readLine("입력하세요:");
        
        
        System.out.println(line);
        
    }
    
}


