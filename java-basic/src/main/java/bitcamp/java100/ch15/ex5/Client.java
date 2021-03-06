package bitcamp.java100.ch15.ex5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
    
    public static void main (String[] args) throws Exception {
        
        File photo = new File("d.JPG");
        
        FileInputStream fileIn = new FileInputStream(photo);
        
        Socket socket = new Socket("localhost", 9999);
        
        DataOutputStream netOut = new DataOutputStream(socket.getOutputStream());
        
        long start = System.currentTimeMillis();
        
        netOut.writeUTF(photo.getName());
        
        netOut.writeLong(photo.length());
        
        int b;
        while ((b = fileIn.read()) != -1) {
            netOut.write(b);
        }
        DataInputStream netIn = new DataInputStream(socket.getInputStream());
        String response = netIn.readUTF();
        long end = System.currentTimeMillis();
        System.out.println(response);
        System.out.println(end-start);
        
        fileIn.close();
        netIn.close();
        netOut.close();
        socket.close();
        
    }

}
