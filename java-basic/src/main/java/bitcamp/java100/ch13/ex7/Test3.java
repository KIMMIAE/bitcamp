package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {

    static void m1(int i) throws RuntimeException, Error, ArithmeticException, IndexOutOfBoundsException {
        switch (i) {
        case 1: throw new RuntimeException();
        case 2: throw new Error();
        case 3: throw new ArithmeticException();
        case 4: throw new IndexOutOfBoundsException();
        }
    }

    // Error 계열과 RuntimeException 계열의 예외를 던질 떄는 메서드 선언부에 예외 타입을 나열하지 않아도 된다.
    static void m2(int i) {
        switch (i) {
        case 1: throw new RuntimeException();
        case 2: throw new Error();
        case 3: throw new ArithmeticException();
        case 4: throw new IndexOutOfBoundsException();
        }
    }
    
    
    public static void main(String[] args) throws IOException, Exception {

    
    }

}
