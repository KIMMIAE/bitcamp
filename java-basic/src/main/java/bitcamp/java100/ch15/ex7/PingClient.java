package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class PingClient {

    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("서버주소? ");
        String serverAddr = keyboard.nextLine();
        
        System.out.print("보낼 메시지? ");
        String message = keyboard.nextLine();
        
        keyboard.close();
        
        
        DatagramSocket socket = new DatagramSocket();
        
        byte[] bytes = message.getBytes("UTF-8");
        
        InetAddress ip = InetAddress.getByName(serverAddr);
                //객체 생성 과정이 복잡할 때는 메서드를 통해서 만들도록 유도.
        
        int port = 9999;
        
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
        
        socket.send(packet);
        socket.close();
        
        System.out.println("데이터 출력 완료");
        
    }

}
