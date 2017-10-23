// 클래스 문법의 용도 - 유지보수가 편하게 서로 관련된 메서드를  메서드를 묶는 문법
package bitcamp.java100.ch06.ex2;

import java.io.Console;

// 클래스 문법 사용 전
public class Test2 {
    
    static Console console;

    
    static void prepareConsole() {
        console = System.console();
        if ( console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        
    }
    
    public static void main(String[] args) {
        prepareConsole();
        
        while (true) {
        Score score = new Score();
        ScoreView.input(score);
        ScoreDao.add(score);
        
        if (!MessageBox.confirm("계속하시겠습니까?")) {
            break;
        }
    }
        
        for (int i = 0; i < ScoreDao.size(); i++) {
            ScoreView.print(ScoreDao.get(i));
        }
    }
}
