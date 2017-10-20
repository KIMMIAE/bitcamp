// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 기본 생성자 호출하기
public class Test8 {
    public static void main(String[] args) {
        // 학생의 성적 정보를 저장할 변수를 준비하라.
        Score7 score;
        
        // 파라미터 값을 주지 않으면 기본 생성자를 찾아 호출한다.
        score = new Score7();
        
        System.out.printf("이름=%s\n", score.name);
        System.out.printf("총점=%d\n", score.sum);
        System.out.printf("평균=%f\n", score.aver);
        
        
    }

}
