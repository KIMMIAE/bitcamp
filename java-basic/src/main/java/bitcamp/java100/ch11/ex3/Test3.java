package bitcamp.java100.ch11.ex3;

public class Test3 {
    
    
    public static void main(String[] args) {
        Truck car = new Truck();
        car.model = "타이탄2";
        car.cc = 6000;
        car.weight = 3.8f;
      
        car.load(3.8f);
        car.move();
        car.stop();
        car.dump();
    }

}
