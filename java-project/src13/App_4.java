package java100.app;
import java.util.Scanner;

// Score 객체의 주소를 저장하고 꺼내는 코드를 별도의 클래스로 분리하라!


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
        ScoreDao scoreDao = new ScoreDao();
        ScoreDao scoreDao2 = new ScoreDao();
        
        while (true) {
            Score score = new Score();
            score.input();  // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            // 인스턴스( 주소)를 배열에 저장한다.
            scoreDao.add(score);
            
            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        
        // 레퍼런스 배열에 저장된 각각의 인스턴스 주소로 찾아가서
        // 성적 데이터를 출력한다.
        for (int i = 0; i < scoreDao.size(); i++) {
            scoreDao.get(i).print();
        }
        }
    }
