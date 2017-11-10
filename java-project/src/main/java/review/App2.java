/*

성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠습니까?(Y/n) <== 'Y' 또는 'y', 그냥 엔터치기 
이름? 임꺽정
국어? 90
영어? 90
수학? 90
계속 입력하시겠습니까?(Y/n) n

성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0
성적관리> view
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0

성적관리> view
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.
성적관리> delete
이름? 홍길동
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

성적관리> delete
이름? 임꺽정
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

성적관리> delete
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

성적관리> update
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> remove
수행할 수 없는 명령입니다.

성적관리> quit
프로그램을 종료합니다.

 */

package review;

import java.util.ArrayList;
import java.util.Scanner;

import java100.app.domain.Score;

//1단계 
//=> "성적관리>" 프롬프트를 출력하여 사용자로부터 입력을 받는다.
public class App2 {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        

        ArrayList<Score> list = new ArrayList<>();
        
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
            System.out.println(input);
            System.out.println();
            
        }
    }  
}
