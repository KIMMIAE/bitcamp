package bitcamp.java100.ch06.ex1;

// 파라미터가 있는 "생성자(constructor)"
public class Score4 {
    //필드 선언
    // => 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 인스턴스를 만들 때 자동으로 호출되는 메서드
    // => "생성자(constructor)"라 부른다.
    
    Score4(String name, int kor, int eng, int math) {
        System.out.println("Scores4() 호출됨!");
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;

    }
}

