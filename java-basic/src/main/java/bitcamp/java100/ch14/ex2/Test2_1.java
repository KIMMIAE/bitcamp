package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_1 {

    public static void main(String[] args) throws IOException {

        int[] data = new int[4000000];
      
        for (int i = 0 ; i < data.length; i++) {
            data[i] = (int)(Math.random()*1000000);

        }
        
        long start = System.currentTimeMillis();
        FileOutputStream out = new FileOutputStream("./test2.dat");
        for (int b : data) {
            out.write(b);
        }
        long end = System.currentTimeMillis();
        
        System.out.printf("걸린시간 = %d\n", (end - start));
        /*
        File file = new File("./test.dat");
        FileOutputStream out = new FileOutputStream(file);
        
        int[] data = {0x66554420, 0x66554421, 0x66554422, 0x66554423, 0x66554424, 0x66554425, 0x66554426, 0x66554427, 0x66554428, 0x66554429};
        
        for (int b : data) {
            System.out.println(Integer.toHexString(b));
            out.write(b);
        }
        out.close();
     */   
    }

}
