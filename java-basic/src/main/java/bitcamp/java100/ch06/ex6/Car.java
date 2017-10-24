package bitcamp.java100.ch06.ex6;

public class Car {
    // 모든 차량이 공유하는 변수는 스태틱 변수로 선언해야 한다.
    static int count;
    
    
    
    long no;
    String model;
    int cc;
    
    Car(String model, int cc) {
        // 
        count++;
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis();
       
        try {//객체 생성하는데 최소 0.05초 걸린다고 가정하자!
            Thread.currentThread().sleep(50);
        } catch (Exception e) {}
    }
}
