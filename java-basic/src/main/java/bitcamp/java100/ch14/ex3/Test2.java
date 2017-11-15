package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileInputStream in = new FileInputStream("test1.dat");
        
        int len = in.read();
        
        
        byte[] bytes = new byte[len];
        in.read(bytes);
        
        s.setName(new String(bytes, "UTF-8"));
        
        s.setKor(in.read());
        s.setEng(in.read());
        s.setMath(in.read());
        
        in.close();
        
        System.out.println("출력완료");
    }


    }

