// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100.test21.step4;

import java.io.Console;
// 4단계: 저장할지 말지 여부를 ...
public class Test {


    public static void main(String[] args) {

        Console console = System.console();
        
        if ( console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // 에러 출력할 때 알아보기 쉽게 하기 위한 장치 'err'
            System.exit(1); // JVM을 종료한다.
        }
        
        // 값을 저장할 레퍼런스 배열을 만든다.
        String[] names = new String[100];
        String[] emails = new String[100];
        String[] tels = new String[100];
        
        // 값이 저장될 위치
        int cursor = 0;
        
        while (cursor < names.length) { 
        String name = console.readLine("이름? ");
        String email = console.readLine("이메일? ");
        String tel = console.readLine("전화? ");
        String response = console.readLine("저장하시겠습니까?(y/n) "); // 대문자 입력도 OK
        
        if (response.toLowerCase().equals("y") || 
                response.toLowerCase().equals("yes")) {
            names[cursor] = name;
            emails[cursor] = email;
            tels[cursor] = tel;
            cursor++;
        }
        
        response = console.readLine("계속 입력하시겠습니까?(y/n) "); //메서드 블록안에 중복이름을 갖는 변수를 선언할 수 없음!
        if (!(response.toLowerCase().equals("y") ||
             response.toLowerCase().equals("yes")))
            break;
        }
        
        
    for (int i= 0; i < cursor; i++) {
        System.out.printf("%s, %s, %s\n", names[i], emails[i], tels[i]);
        }
    }
}
