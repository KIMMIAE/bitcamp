package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;

public class Test1_0 {
    
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileOutputStream out = new FileOutputStream("test1.dat");
        
        out.write(s.getName().getBytes("UTF-8"));
        out.write(s.getKor());
        out.write(s.getEng());
        out.write(s.getMath());
        out.write(s.getSum());
        //out.write(s.getAver());
        
        out.close();
    }


    }

