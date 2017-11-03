package java100.app;

import java.util.ArrayList;
import java.util.Iterator;

public class ScoreController2 {
    static String name = null;
    static Score score = null;

    private ArrayList<Score> list = new ArrayList<>();
    
    public void doDelete() {
        Iterator<Score> iterator;
        System.out.println("[학생 삭제]");
        name = Prompts.input("이름? ");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    public void doUpdate() {
        Iterator<Score> iterator;
        System.out.println("[학생 정보 변경]");
        name = Prompts.input("이름? ");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.update();
        }
    }

    public void doView() {
        Iterator<Score> iterator;
        System.out.println("[학생 정보]");
        name = Prompts.input("이름? ");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            Score temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.printDetail();
        }

    }

    public void doList() {
        Iterator<Score> iterator;
        System.out.println("[학생 목록]");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }

    }

    public void doAdd() {
        System.out.println("[학생 등록]");
        Score score;
        while (true) {
            score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

            list.add(score);

            if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
                break;
        }
}
}
