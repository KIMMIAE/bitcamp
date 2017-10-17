package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width;
    int height;
    
    // 인스턴스 매서드로 만들기
    //  => static 키워드를 제거(인스턴스 메서드 : 그 인스턴스의 데이터만 다루는 전용 메서드)
    
    float area() {
        return (this.width * this.height) / 10000f;
    }
    
    // '평'을 구하는 메서드
    float pyeong() {
        return (this.width * this.height) / 10000f / 3.3f;
    }
}
    
