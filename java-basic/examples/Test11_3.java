package bitcamp.java100;

public class Test11_3 {  
    public static void main (String[] args) {
        System.out.print("ABC");
        System.out.print('\b'); //Backspace : 커서를 뒤로 한 칸 이동
        System.out.println("123");

        System.out.println("ABC\t123"); //TAP : 커서를 OS의 기본 칸 수 만큼 이동
        System.out.println("ABC\u0009123");//Tap에 대해 유니코드 값을 직접 입력
        System.out.println("ABC\n123"); //Linefeed : 커서를 다음 줄로 이동
        System.out.println("ABC\r123"); //Carrage Return(CR; 0x000d)
        System.out.println("ABC\f123");//커서를 다음 줄로 이동
        System.out.println("ABC\"123");//double quote
        System.out.println("ABC\'123");//single quote
        System.out.println('\'');//single quote
        System.out.println('"');//double quote
        System.out.println("c:\\workspace\\test"); //backslash
    }                                                                 
}
