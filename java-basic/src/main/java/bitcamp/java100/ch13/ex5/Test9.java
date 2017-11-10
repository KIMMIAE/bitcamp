package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        try {
            System.out.println("try 블록 실행!");
            switch (str) {
            case"a":throw new Exception();
            case"b":throw new IOException();
            case"c":throw new FileNotFoundException();
            case"d":throw new SQLException();
            
            }
            System.out.println(str);


        } catch (IOException | SQLException e) { //Throwable 대신 Object 안되는 이유? : 예외타입이 아니라서
            System.out.println("IOException|SQLException 예외 처리!");
            
        }catch (Exception e) {
            
        }

    }

}
