
package java100.app;

import java.util.Scanner;
 
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
        
        // ArrayList는 Score 타입뿐만 아니라 자바의 모든 타입의 객체에 대해서도 
        // 사용할 수 있다.
        ArrayList list = new ArrayList();
        
        while (true) {
            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            list.add(score);

            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        for (int i = 0; i < list.size(); i++) {
            
            
            //ArrayList에 어떤 값을 저장할지 알려줬기 때문에 
            // 값을 꺼낼 때 따로 
            //((Score)list.get(i)).print();
            
            ((Score) list.get(i)).print();
            
            
        }
    }
}

