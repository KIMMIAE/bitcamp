import java.io.Console;

public class Test {
    
    static  Console console;
    static Score[] scores = new Score[10000];
    static int cursor = 0;
    
    static void prepareScore() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔 출력을 지원하지 않습니다!");
            System.exit(1); // () <- 0 이외의 모든 숫자 다 됨.
        }
        
        while (true) {
        Score score = new Score( 
                console.readLine("이름? "),
                Integer.parseInt(console.readLine("국어 점수? ")),
                Integer.parseInt(console.readLine("영어 점수는? ")),
                Integer.parseInt(console.readLine("수학점수? "))
        );

        scores[cursor++] = score;
        
        if (cursor == scores.length) {
            System.out.println("최대 저장 개수를 초과했습니다!");
            break;
        }
        
        if (!confirm("계속 입력하시겠습니까?")) {
            break;
        }
    }
    }
    
    static void printScore() {
        for (int i = 0; i < cursor; i++) {
            
        System.out.printf("%10s, %3d, %3d, %3d, %3d, %5.2f\n", 
                scores[i].name, 
                scores[i].kor, 
                scores[i].eng, 
                scores[i].math, 
                scores[i].sum, 
                scores[i].aver);
    }
    }
    
    static boolean confirm(String message) {
        String response = console.readLine(message).toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        prepareScore();
        printScore();
    }
}
