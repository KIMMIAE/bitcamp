// 프로그램 아규먼트와 VM 아규먼트
package bitcamp.java100.ch15.ex6;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    
    public static void main(String[] args) {
        //java -cp bin -Daaa=111 -Dbbb=222...Test1 xxx yyy zzz
        
        System.out.println("------------------------------------------");
        
        for (String value : args) {
            System.out.println(value);
        }
        System.out.println("-------------------------------------------");
        System.out.println(System.getProperty("aaa"));
        System.out.println(System.getProperty("bbb"));
        
        System.out.println("-------------------------------------------");
        Properties props = System.getProperties();
        Set<Object> Keyset = props.keySet();
        for (Object key : Keyset) {
            System.out.printf("%s=%s\n", key, props.get(key));
        }
        
    }

}
