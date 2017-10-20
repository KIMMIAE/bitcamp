package bitcamp.java100.ch06.ex1;

// 인스턴스 초기화 문장
public class Score10 {
    //필드 선언
    // => 변수 선언에 값을 할당하는 문장이 있으면,
    //    변수를 생성한 후에 바로 실행한다
    String name = "이름없음";
    int kor = 10;;
    int eng = 10;;
    int math;
    int sum;
    float aver;
    
    

    // 인스턴스 초기화 블록 정의
    // => 생성자가 호출되기 전에 먼저 실행된다.
    // => 생성자를 만들 수 없는 익명 클래스를 정의할 때 사용할 수 있다.
    {
        this.name = "홍길동";
        this.kor = 20;
    }
    
    Score10() {
        this.name = "임꺽정";
        
        compute();
    }
    

    // 메서드 정의(= 연산자 정의)
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
       
    }
}

