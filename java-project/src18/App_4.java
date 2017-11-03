//: ## ver 18
//: - 기능 추가: 변경, 삭제 기능을 추가하라!
//: - 요구사항
//:   - App.java 클래스의 주석을 확인하라!
//: 
//: 
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
package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 9단계:
// => 성적 변경 기능 중에서 사용자가 점수를 입력할 때
//    엔터를 입력하거나 숫자가 아닌 값을 입력할 경우 
//    예외 처리한다.
//    Score 클래스의 update()
public class App_4 {

    static Scanner keyScan = new Scanner(System.in);


    public static void main(String[] args) {
        
        ScoreController scoreController = new ScoreController();

        loop: while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();

            switch (input) {
            case "add": scoreController.doAdd(); break;
            case "list": scoreController.doList(); break;
            case "view": scoreController.doView(); break;
            case "delete": scoreController.doDelete(); break;
            case "update": scoreController.doUpdate(); break;
            case "quit": doQuit(); break loop;
            default: doError();
            }
            System.out.println();
        }
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");

    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");

    }
    }