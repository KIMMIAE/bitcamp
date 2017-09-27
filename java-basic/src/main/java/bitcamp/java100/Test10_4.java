package bitcamp.java100;

public class Test10_4 {  
    public static void main (String[] args) {

        System.out.printf("%4$2s, %3$3s, %2$4s, %1$5s\n", "a", "b", "c", "d");

        System.out.printf("%s,%d,%o,%x,%h,%f,%b,%tY\n",
        "홍길동", 100, 100, 100, 100, 3.14, true, new java.util.Date());

        System.out.printf("%f, %.1f, %.2f, %.3f, %.4f, %.5f\n" , 
        3.14159, 3.141592, 3.141592, 3.141592, 3.141592, 3.141592);

        System.out.printf("%1$f, %1$.1f, %1$.2f, %1$.3f, %1$.4f, %1$.5f\n", 
        3.141592);

        System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n",
        "홍길동", 3.14);

        System.out.printf("%10s,%-10s\n", "홍길동", "임꺽정");

        System.out.printf("'%10s','%-10s'\n", "홍길동", "임꺽정");

        System.out.printf("%d,%+d\n", 100, 100);

        System.out.printf("%5d,%05d\n", 123, 123);

        System.out.printf("%1$tH, %1$tI, %1$tM, %1$tS, %1$tp\n", 
        new java.util.Date());

        System.out.printf("%1$tH:%1$tM:%1$tS\n", 
        new java.util.Date());

        System.out.printf("%1$tY, %1$ty, %1$tm, %1$td, %1$te\n", 
        new java.util.Date());

        System.out.printf("%1$tm, %1$tB, %1$tb\n", 
        new java.util.Date());

        System.out.printf("%1$tA, %1$ta\n", 
        new java.util.Date());


    

    }                                                                 
}
