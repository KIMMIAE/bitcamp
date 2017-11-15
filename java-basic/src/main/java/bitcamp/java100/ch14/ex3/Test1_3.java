package bitcamp.java100.ch14.ex3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test1_3 {

    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);

        
        DataOutputStream out2 = new DataOutputStream(new  FileOutputStream("test3.dat"));
        
        out2.writeUTF(s.getName());
        out2.writeInt(s.getKor());
        out2.writeInt(s.getEng());
        out2.writeInt(s.getMath());

        out2.close();
        System.out.println(s);
    }

}
