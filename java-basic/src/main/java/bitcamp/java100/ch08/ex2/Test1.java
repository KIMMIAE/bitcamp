// 다형성(Polymorphism)
package bitcamp.java100.ch08.ex2;

public class Test1 {

    public static void main(String[] args) {

        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();

        Boat b;
        b = new Boat();
        // b = new Vehicle(); // 상위 분류를 하위 분류로 가리킬 수 없다.
        // b = new Car(); // 다른 파생 분류를 가리킬 수 없다.
        // b = new Truck(); // 다른 파생 분류를 가리킬 수 없다.
        // b = new Sedan(); // 다른 파생 분류를 가리킬 수 없다.

        Car c;
        c = new Truck();
        c = new Sedan();
        // c = new Boat(); // 다른 파생 분류를 가리킬 수 없다.
        // c = new Vehicle(); // 상위 분류를 하위 분류로 가리킬 수 없다.

        Sedan s;
        s = new Sedan();
        // s = new Truck();
        // s = new Car();
        // s = new Boat();
        // s = new Vehicle();

        // 이렇게 상속 관계에 따라 한 레퍼런스에 다양한 클래스의 객체 주소를
        // 저장할 수 있다고 해서 "다형적 변수"라고 부른다.
        //
        // 다형적 변수의 용도?
        // => 한 개의 변수로 같은 종류의 여러 클래스의 객체를 저장할 수 있어서
        // 프로그래밍이 편하다.
        // => 즉 구체적인 타입을 지정하기 보다는
        // 그것의 상위 타입을 지정함으로써
        // 그 자리에 다른 타입의 객체를 넣을 수 있다.
        // 물론 분류상 같은 계열의 객체에 대해서만 가능하다.
        
        Sedan r1; // Sedan 객체만 가리킬 수 있다.
        Vehicle r2; // Vehicle 뿐만 아니라 그 하위의 모든 클래스의 인스턴스를 가리킬 수 있다.
    
    }

}
