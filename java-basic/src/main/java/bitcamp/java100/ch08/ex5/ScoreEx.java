// 다형성 - 오버라이딩
// compute() 메서드는 국, 영, 수 과목의 합계와 평균을 계산한다.
//
package bitcamp.java100.ch08.ex5;

public class ScoreEx extends Score {
    int sci;
    int soc;

    public ScoreEx() {
    }

    public ScoreEx(int no, String name, int kor, int eng, int math, int sci, int soc) {
        super(no, name, kor, eng, math);
        this.sci = sci;
        this.soc = soc;

        this.compute();
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;

        this.compute();
    }

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;

        this.compute();
    }

    @Override
    protected void compute() {
        // 오버라이딩 할 때 완전히 모든 코드를 재작성하는 경우가 있고,
        // 현재의 경우처럼 기존의 코드를 사용하는 경우가 있다.
        
        // => 기존의 compute()를 호출하여 국, 영, 수 합계를 일단 구한다.
        super.compute();
        // 의미?
        // => 현재 클래스가 아니라 수퍼 클래스부터 compute() 를 찾아 올라가라.
        
        this.sum += this.sci + this.soc;
        this.aver = this.sum / 5f;
    }

}
