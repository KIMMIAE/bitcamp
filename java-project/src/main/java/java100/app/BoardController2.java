package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController2 {
    static Scanner keyScan = new Scanner(System.in);

    private ArrayList<Board2> list = new ArrayList<>();

    public void execute() {
        loop: while (true) {
            System.out.print("회원관리> ");
            String input = keyScan.nextLine();

            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "list":
                this.doList();
                break;
            case "add":
                this.doAdd();
                break;
            // case "view": this.doView(); break;
            // case "update": this.doUpdate(); break;
            // case "delete": this.doDelete(); break;
            // case "main": break loop;
            default:
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }

    private void doAdd() {
        System.out.println("[회원 등록]");

        Board2 board;
        board = new Board2();
        board.input();

        boolean isExist = false;
        Iterator<Board2> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.hasNext().nextInt(board.num)) {
                isExist = false;
                break;
            }
        }

        if (isExist) {
            System.out.printf("이미 등록된 이메일입니다.");
        } else {
            list.add(board);
        }

    }

    private void doList() {
        System.out.println("[게시 목록]");

        Iterator<Board2> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }

    }

}
