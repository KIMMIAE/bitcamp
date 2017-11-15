package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;

public class Test1_1 {

    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);

        FileOutputStream out = new FileOutputStream("test1.dat");

        byte[] bytes = s.getName().getBytes("UTF-8");

        out.write(bytes.length); // length = 0x 00 00 00 09

        out.write(bytes);

        out.write(s.getKor() >> 24);
        out.write(s.getKor() >> 16);
        out.write(s.getKor() >> 8);
        out.write(s.getKor());
        
        out.write(s.getEng() >> 24);
        out.write(s.getEng() >> 16);
        out.write(s.getEng() >> 8);
        out.write(s.getEng());
        
        out.write(s.getMath() >> 24);
        out.write(s.getMath() >> 16);        
        out.write(s.getMath() >> 8);
        out.write(s.getMath());
        // out.write(s.getAver());

        out.close();
        System.out.println(s);
    }

}
