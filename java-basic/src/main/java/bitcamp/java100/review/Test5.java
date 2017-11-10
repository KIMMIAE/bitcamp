package bitcamp.java100.review;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        
        boolean run = true;
        int balance = 0;
        
        Scanner Scanner = new Scanner(System.in);
        
        while (run ) {
            int i = 0;
            System.out.println("------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------------");

            System.out.print("선택> ");
            int num = Scanner.nextInt();
            
            if (num == 1) {
                System.out.print("예금액> ");
                int money = Scanner.nextInt();
            } else if (num == 2) {
                System.out.print("출금액> ");
                int b = Scanner.nextInt();
            } else if (num == 3) {
                System.out.println("잔고> ");
                int a = Scanner.nextInt();
            }else if(num == 4) {
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
            
            
            
        }
        
        
    }
}
