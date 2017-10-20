package bitcamp.java100.ch06.ex1;

// 인스턴스 초기화 블록
public class Score9 {
    //필드 선언
    // => 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    

    // 인스턴스 초기화 블록 정의
    // => 생성자가 호출되기 전에 먼저 실행된다.
    // => 생성자를 만들 수 없는 익명 클래스를 정의할 때 사용할 수 있다.
    {
        System.out.println("인스턴스 초기화 블록 실행!");
    }
    
    Score9() {
        System.out.println("Score9() 호출됨!");
    }
    
    Score9(String name) {
        System.out.println("Score9(String) 호출됨!");
    }
    
    {
        System.out.println("인스턴스 초기화 블록 실행22222!");
    }
    
    // 메서드 정의(= 연산자 정의)
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
       
    }
    
    {
        System.out.println("인스턴스 초기화 블록 실행3333!");
    }
    
    
    
}

