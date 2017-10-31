// 다형성 - equals() 오버라이딩 사용 후
package bitcamp.java100.ch08.ex5;


public class Test2 {
    public static void main(String[] args) {
        
        ScoreEx2 s1 = new ScoreEx2(1, "홍길동", 100, 100, 100, 80, 80);

        System.out.printf("합계=%d\n", s1.getSum());
        System.out.printf("평균=%f\n", s1.getAver());
        
        System.out.println("--------------------------------------");
        
        s1.setKor(80);
        System.out.printf("합계=%d\n", s1.getSum());
        System.out.printf("평균=%f\n", s1.getAver());
        
    }

}
