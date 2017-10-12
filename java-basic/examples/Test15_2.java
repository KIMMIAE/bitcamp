package bitcamp.java100;

public class Test15_2 {  
    
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        //byte b3 = b1 - b2;//컴파일 오류!

        short s1 = 10;
        short s2 = 20;
        //short s3 = s1 + s2; //s1과 s2의 연산 결과는 int이다.//컴파일 오류!

        int r = s1 + s2; // OK
        long r2 = s1 + s2; // 물론 결과 타입 보다 더 큰 메모리는 OK
       
         }
    }
 