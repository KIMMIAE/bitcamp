package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_2 {

    // 파일만 걸러내는 필터
    static class MyFilenameFilter implements FilenameFilter{
        @Override
        public boolean accept(File dir, String name) {
            // 이 메서드는 list() 또는 listFiles()에서 호출한다.
            
           File file = new File(dir, name);
           if (file.isDirectory())
               return false;
           else
             return true;
        }
    }

    public static void main(String[] args) {
        
        File file = new File(".");
        
        String[] filenames = file.list(new MyFilenameFilter());
        
        for (String name : filenames) {
            System.out.println(name);
        }
    }

}
