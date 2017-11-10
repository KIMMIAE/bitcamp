package bitcamp.java100.review;

public class Test3 {

    public static void main(String[] args) {
        for (int x = 1; x <=10; x++) {
            for (int y = 1; y <=10; y++) {
                int sum = (4 * x) + (5 * y);
                if (sum == 60) {
                    System.out.printf("(%s, %s)\n", x, y);
            }
                
            }
        }
        
        
        
    }

}
