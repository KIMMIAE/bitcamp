package bitcamp.java100.ch06.ex6;

public class Test2 {

    public static void main(String[] args) throws Exception {
        Car2[] cars = new Car2[6]; // []<-레퍼런스 배열(주소를 저장하는 배열)을 만든다는 의미
        cars[0] = new Car2("티코", 900, 3, 2);
        cars[1] = new Car2("티코", 900, 2, 1);
        cars[2] = new Car2("티코", 900, 1, 3);
        
        cars[3] = new Car2("소나타", 1900, 1, 1);
        cars[4] = new Car2("소나타", 1900, 2, 2);
        cars[5]= new Car2("소나타", 1900, 3, 3);
        
        System.out.printf("총 생산량 = %d 대\n", Car2.count);
        
        for (int i = 0; i < cars.length; i++) {
        System.out.printf("%d, %s, %d\n", cars[i].no, cars[i].model, cars[i].cc);
        }
    }
}
