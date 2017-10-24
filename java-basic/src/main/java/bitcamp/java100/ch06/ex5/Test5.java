package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test5 {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);

      String response = keyScan.nextLine().toLowerCase();
       // keyScan.close();
    if (response.equals("y") || response.equals("yes"))
        return true;
    return false;
    }

    // 4단계: 여러 개의 성적 데이터를 다룰 때 문제점


    public static void main(String[] args) {
        
        Score2[] scores = new Score2[100];
        int cursor = 0;
        
        while (true) {
            Score2 score = new Score2();
            score.input();
            
            scores[cursor++] = score;
        
        if (!confirm("계속하시겠습니까?"))
            break;
        }
        
        for (int i = 0; i < cursor; i++) {
            scores[i].print();
        }
        
    }
}
