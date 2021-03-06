package bitcamp.java100.ch13.ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }
    
    static ArrayList<Score> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    static void input() throws Exception {
        Score s = new Score();
        
        System.out.print("이름? ");
        s.name = keyScan.nextLine();
        
        if (s.name.length() == 0) {
            throw new Exception("EmptyName");
        }

        System.out.print("국어? ");
        try {
        s.kor = Integer.parseInt(keyScan.nextLine());
         if (s.kor < 0 || s.kor >100)
             throw new Exception("ScoreOutOfBounds");
        }catch (NumberFormatException e) {
            throw new Exception("NumberFormatError");
        }
        System.out.print("영어? ");
        try {
        s.eng = Integer.parseInt(keyScan.nextLine());
        if (s.eng < 0 || s.eng >100)
            throw new Exception("ScoreOutOfBounds");
        }catch (NumberFormatException e) {
            throw new Exception("NumberFormatError");
        }
        System.out.print("수학? ");
        try {
        s.math = Integer.parseInt(keyScan.nextLine());
        if (s.math < 0 || s.math >100)
            throw new Exception("ScoreOutOfBounds");
        } catch (NumberFormatException e) {
            throw new Exception("NumberFormatError");
        }
        s.sum = s.kor + s.eng + s.math;
        s.aver = s.sum / 3f;
        
        list.add(s);
        
    }
    
    static void print () {
        for (Score s : list) {
            System.out.printf("%s, %d, %d, %d, %d, %f\n", 
                    s.name, s.kor, s.eng, s.math, s.sum, s.aver);
        }
    }
    
    
    public static void main(String[] args) {
        
        while (true) {
            try {
            input();
            }catch (Exception e) {
                String message = e.getMessage();
                
                if (message.equals("EmptyName")) {
                    System.out.println("입력 문자열이 비어 있습니다.");
                }else if (message.equals("ScoreOutOfBounds")) {
                    System.out.println("점수의 범위를 벗어났습니다.");
                }else if (message.equals("NumberFormatError")) {
                    System.out.println("숫자 형식이 아닙니다.");
                }
            }
            System.out.print("계속 하시겠습니까? (Y/n)");
            String str = keyScan.nextLine().toLowerCase();
            if (str.equals("") || str.equals("y") || str.equals("yes")) {
                continue;
            }
            break;
        }
        System.out.println("--------------------------------------");    
        print();
        
       
    }

}
