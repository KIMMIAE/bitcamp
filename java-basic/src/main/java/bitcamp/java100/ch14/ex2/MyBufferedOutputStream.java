package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 상속을 이용한 기능 확장
public class MyBufferedOutputStream extends FileOutputStream {
    
    byte[] buf = new byte [8192];
    int len;
    int cursor;
    
    public MyBufferedOutputStream(String path) throws FileNotFoundException {
        super(path);    
    }

    @Override
    public void write(int b) throws IOException {
        if (cursor == buf.length) {
            this.write(buf);
            cursor = 0;
            }
        buf[cursor++] = (byte)b;

    }

}
