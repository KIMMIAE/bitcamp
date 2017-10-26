import java.util.Scanner;

// 키보드로 성적 정보를 입력받아 저장하라!
// 계속 저장할지 여부를 물어 저장을 물어봐라!
// 저장을 완료하면 모든 성적을 출력하라!

public class App_4 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Score[] scores = new Score[100];
        int cursor = 0;
        
        while (true) {
            Score score = new Score();
            score.input();  // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            // 인스턴스( 주소)를 배열에 저장한다.
            scores[cursor++] = score;
            
            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        
        // 레퍼런스 배열에 저장된 각각의 인스턴스 주소로 찾아가서
        // 성적 데이터를 출력한다.
        for (int i = 0; i < cursor; i++) {
            scores[i].print();
        }
        }
    }
