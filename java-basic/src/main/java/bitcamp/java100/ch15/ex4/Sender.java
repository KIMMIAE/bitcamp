package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
 public static void main(String[] args) throws Exception {
    
     Scanner keyBoard = new Scanner(System.in);
     Socket socket = new Socket("192.168.0.58", 9999);
     
     PrintStream out = new PrintStream(socket.getOutputStream());
     out.println("sender");
     
     while (true) {
         System.out.println("입력: ");
         out.println(keyBoard.nextLine());
     }
}   
}
