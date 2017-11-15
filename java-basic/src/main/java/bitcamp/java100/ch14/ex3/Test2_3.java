package bitcamp.java100.ch14.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2_3 {

    public static void main(String[] args) throws Exception {
        Score s = new Score();

        DataInputStream in2 = new DataInputStream(new FileInputStream("test2.dat"));


        s.setName(in2.readUTF());
        s.setKor(in2.readInt());
        s.setEng(in2.readInt());
        s.setMath(in2.readInt());

        in2.close();

        System.out.println(s);
    }

}
