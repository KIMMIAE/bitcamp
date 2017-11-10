package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {

    static void m1(int i) throws Throwable {
        if (i < 0) {
            throw new Throwable();
        }
    }
    
    //타입을 나열할 때 순서는 상관 없음.
    static void m2(int i) throws SQLException, Exception, IOException, FileNotFoundException {
        switch(i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    //메서드에서 던지는 예외의 공통 수퍼 클래스를 지정해도 된다.
    static void m3(int i) throws Exception {
        switch(i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }

    static void m4(int i) throws Throwable {
        switch(i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    

    /* 컴파일 오류!
    static void m5(int i) throws Object {       
        switch(i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    */
    //Throwable 타입이 아닌 것은 던질 수 없다.
   
    /* 컴파일 오류!
    static void m6(int i) throws String {
        switch(i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    */
    
    
    public static void main(String[] args) {

    }

}
