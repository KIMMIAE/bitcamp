package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_4 {

    public static void main(String[] args) throws IOException {
        File file = new File("./test.dat");
        FileOutputStream out = new FileOutputStream(file);
        
        int[] data = {0x66554420, 0x66554421, 0x66554422, 0x66554423, 0x66554424, 0x66554425, 0x66554426, 0x66554427, 0x66554428, 0x66554429};
        
        for (int b : data) {
            System.out.println(Integer.toHexString(b));
            out.write(b);
        }
        out.close();
        
    }

}
