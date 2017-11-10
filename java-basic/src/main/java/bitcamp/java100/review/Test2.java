package bitcamp.java100.review;

public class Test2 {
    public static void main(String[] args) {
        

        while (true) {
            int a = (int) (Math.random()*6) + 1;
            int b = (int) (Math.random()*6) + 1;
            int sum = a + b;
            if (sum != 5) { 
                System.out.printf("(%d, %d)\n", a, b);
            } else if(sum == 5){
                System.out.println("합계 5, 종료!");
                break;
            }
        }
    }
}
