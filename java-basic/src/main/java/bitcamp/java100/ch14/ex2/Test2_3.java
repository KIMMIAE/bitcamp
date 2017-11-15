package bitcamp.java100.ch14.ex2;

import java.io.IOException;

public class Test2_3 {

    public static void main(String[] args) throws IOException {

        byte[] data = new byte[4000000];
      
        for (int i = 0 ; i < data.length; i++) {
            data[i] = (byte)(Math.random()*255);

        }
        
        MyBufferedOutputStream out = new MyBufferedOutputStream("./test2.dat");
        
        long start = System.currentTimeMillis();
        int len = 0;
        for (int i = 0; i < data.length; i += 8192) {
            out.write(data, i, (data.length - i) > 8192 ? 8192 : data.length - i);
        }
        
        out.flush(); // 버퍼에 남은 마지막 찌끄러기 출력하기
        
        long end = System.currentTimeMillis();
        
        System.out.printf("걸린시간 = %d\n", (end - start));
        
        out.close();
        
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
