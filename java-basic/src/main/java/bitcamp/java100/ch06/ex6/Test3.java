package bitcamp.java100.ch06.ex6;

public class Test3 {

    public static void main(String[] args) throws Exception {
        Car3[] cars = new Car3[6]; // []<-레퍼런스 배열(주소를 저장하는 배열)을 만든다는 의미
        cars[0] = new Car3("티코", 900, Car3.TYPE_BUS, Car3.TYPE_COMPANY);
        cars[1] = new Car3("티코", 900, Car3.TYPE_SEDAN, Car3.USE_PRIVATE);
        cars[2] = new Car3("티코", 900, Car3.TYPE_TRUCK, Car3.TYPE_COMMERCIAL);
        
        cars[3] = new Car3("소나타", 1900, Car3.TYPE_TRUCK, Car3.USE_PRIVATE);
        cars[4] = new Car3("소나타", 1900, Car3.TYPE_SEDAN, Car3.TYPE_COMPANY);
        cars[5]= new Car3("소나타", 1900, Car3.TYPE_BUS, Car3.TYPE_COMMERCIAL);
        
        System.out.printf("총 생산량 = %d 대\n", Car3.count);
        
        for (int i = 0; i < cars.length; i++) {
        System.out.printf("%d, %s, %d\n", cars[i].no, cars[i].model, cars[i].cc);
        }
    }
}
