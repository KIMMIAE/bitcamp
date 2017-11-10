package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1_3 {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("sample/jls9.pdf");

        int b = 0;
        int count = 0;
        long start = System.currentTimeMillis();
        while ((b = in.read()) != -1) {
            count ++;
        }
        long end = System.currentTimeMillis();
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", (end - start));
        in.close();
        
    }

}
