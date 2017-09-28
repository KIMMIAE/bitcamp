package bitcamp.java100;

public class Test13_7 {  
public static void main (String[] args) {
    
    int a = 100;
    int b;

    b = a;

    b = 200;

    System.out.printf("a=%d, b=%d\n", a, b);

    int[] arr1 = {100, 200, 300};
    int[] arr2;

    arr2 = arr1;

    arr2[1] = 50;

    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);



    }
}