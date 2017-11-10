package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class Test8_1 {


    public static void main(String[] args) throws Exception {
        File file = new File(".");
        
        File [] files = file.listFiles();
        
        for (File f : files) {
            System.out.printf(f.getCanonicalPath());
            
            printFiles(file);
        
        }
    }
    
    public static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        
        for (File f : files) {
            System.out.println(f.getCanonicalPath());
            
            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }
}


