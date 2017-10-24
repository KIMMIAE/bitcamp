package bitcamp.java100.ch06.ex6;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Car[] cars = new Car[6]; // []<-레퍼런스 배열(주소를 저장하는 배열)을 만든다는 의미
        cars[0] = new Car("티코", 900);
        cars[1] = new Car("티코", 900);
        cars[2] = new Car("티코", 900);
        
        cars[3] = new Car("소나타", 1900);
        cars[4] = new Car("소나타", 1900);
        cars[5]= new Car("소나타", 1900);
        
        System.out.printf("총 생산량 = %d 대\n", Car.count);
        
        for (int i = 0; i < cars.length; i++) {
        System.out.printf("%d, %s, %d\n", cars[i].no, cars[i].model, cars[i].cc);
        }
    }
}
