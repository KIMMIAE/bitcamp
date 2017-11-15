// Byte 스트림 응용 => 파일 복사하기 - 버퍼 적용 II
//

package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_4 {
    public static void main(String[] args) throws Exception {
        
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(
                new File("sample/jls9.pdf")));
                
        
        FileOutputStream out = new BufferedOutputStream(new FileOutputStream(
                                    new File("sample/jls9-4.pdf")));
        

        
        
        // 3) 데이터를 읽어서 출력한다.
        int b;
        long start = System.currentTimeMillis();
        
        while ((b = in2.read()) != -1) {
            // 내부적으로 버퍼에 읽고, 버퍼의 내용을 출력한다.
            out2.write(b);
        }
        
        // 버퍼에 남은 잔여 데이터를 출력해야 한다.
        out2.flush();
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        
        // 4) 항상 사용을 마친 자원은 해제시킨다.
        in.close();
        out.close();
        
        System.out.println("파일 복사 완료했음!");
    }
}





