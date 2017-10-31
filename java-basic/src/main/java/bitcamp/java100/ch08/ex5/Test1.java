// 다형성 - equals() 오버라이딩 사용 전
package bitcamp.java100.ch08.ex5;


public class Test1 {
    public static void main(String[] args) {
        
        ScoreEx s1 = new ScoreEx(1, "홍길동", 100, 100, 100, 80, 80);

        System.out.printf("합계=%d\n", s1.getSum());
        System.out.printf("평균=%f\n", s1.getAver());
        
        System.out.println("--------------------------------------");
        
        s1.setKor(80);
        System.out.printf("합계=%d\n", s1.getSum());
        System.out.printf("평균=%f\n", s1.getAver());
        
        //setKor()은 Score 클래스의 메서드이다.
        //setKor()에서 호출하는 compute()는 Score의 compute()인가?
        //아니면 ScoreEX의 compute()인가?
        //결론 :
        //=> compute()를 호출할 때 어떤 클래스의 인스턴스 주소를 줬는지에 따라 결정된다.
        //=> setKor()을 호출할 때 넘겨준 인스턴스는 Score가 아니라 ScoreEx이다.
        //=> 따라서 setKor() 메서드의 this변수에는 ScoreEx의 주소가 들어 있다.
        // 
    }

}
