package review;

public class Test1 {

    public static void main(String[] args) {
        
        for (int a = 2; a <= 9; a++) {
            System.out.printf("%d단\n", a);
            for (int b = 1; b <= 9; b++){
                System.out.printf("%d * %d = %d\n", a, b, (a * b));
            }
            
        }

    }

}
