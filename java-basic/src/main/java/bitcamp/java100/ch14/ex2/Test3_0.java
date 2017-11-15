package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3_0 {

    public static void main(String[] args) throws IOException {
        File file = new File("sample/b.jpg");
        FileInputStream in = new FileInputStream(new File("sample/b.jpg"));
        FileOutputStream out = new FileOutputStream(new File("sample/b2.jpg"));
        int b;
        
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        out.close();
        
        System.out.println("파일 복사 완료했음.");
    }

}
