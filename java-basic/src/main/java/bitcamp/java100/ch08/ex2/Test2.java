// 다형성(Polymorphism)
package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {

        Car c;
        
        c = new Car();
        
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
        //c.auto = true // 오류
        
        c = new Truck();
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = 2;
        c.cylinder = 8;
        c.valve = 32;
        
        //c.weight = 15;
        //c.dump = true;
        
        c = new Sedan();
        

        
        
        //c = new Boat(); // 다른 파생 분류를 가리킬 수 없다.
        //c = new Vehicle(); // 상위 분류를 가리킬 수 없다.
        
        c = new Vehicle(); // 이게 가능하다고 가정했을 때,
        
        c.model = "소나타";
        c.capacity = 4;
        
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
    }

}
