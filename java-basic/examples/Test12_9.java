package bitcamp.java100;

public class Test12_9 {  
public static void main (String[] args) {

    char c1; 

    c1 = 44032;
    char c2 = 0xAC00;

    System.out.println(c1);
    System.out.println(c2);

    char n1 = 0xAE40, n2 = 0xBBF8, n3 = 0xC560;
    System.out.printf("%c %c %c\n", n1, n2, n3);

    n1 = '김';
    n2 = '미';
    n3 = '애';
    System.out.printf("%c %c %c\n", n1, n2, n3);

    char x = '7';
    int num;
    num = x - '0';
    //num = '7' - '0';

    System.out.println(num);

    }
}