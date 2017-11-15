//네트워킹 프로그래밍 - 대기열 테스트
package bitcamp.java100.ch15.ex2;

import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{
        
        
        Socket socket = new Socket("192.168.0.58", 9999);
        System.out.println("서버와 연결되었다.");

        // 상대편 접속 정보 출력
        System.out.printf("%s:%d\n", socket.getInetAddress().getHostAddress(), socket.getPort());
        
        socket.close();

        
    }
}
