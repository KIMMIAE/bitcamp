// 실행 예 )
// 구구단? 2
//  2 * 1 = 2
//  2 * 2 = 4
//  2 * 3 = 6
// ....
//  2 * 9 = 18
// ---------------------
// 구구단? 10
// 2에서 9단까지만 가능합니다!
// 구구단? 1
// 2에서 9단까지만 가능합니다!
//구구단? 0 <==== 0이하의 수를 입력하면 돌아간다
// 다음에 또 봐요!
// >

package bitcamp.java100;

import java.io.Console;

public class Test21_5_X {

    public static void main(String[] args) {
        class Dan {
            int x;
        }
        

        
        Console console = System.console();
        
        Dan d = new Dan(); 
        
        d.x =  Integer.parseInt(console.readLine("구구단?" ));
        if (1 < d.x && d.x < 10) {
            System.out.printf("[%d단]\n", d.x);
        
        for(int i = 1; i < 10; i++) {
        System.out.printf("%d * %d = %d\n", d.x, i, d.x * i);
        }
        
        System.out.println("----------------------------------------");
        
        }
        
        else {
        if (d.x < 0) {
            System.out.println("다음에 또 봐요!");
            }
            
        else {
        if (1 <= d.x ) {
            System.out.println("2에서 9단까지만 가능합니다!");
                }
        else {
        if (10 <= d.x) {
            System.out.println("2에서 9단까지만 가능합니다!");
                    }
                }
            }
        }
    }
}


