package bitcamp.java100.ch07.ex5;

public class E extends A {
    String name;
    int age;

    E() {
        this("홍길동", 20);
    }

    E(int age) {
        this("홍길동", age);
    }

    E(String name) {
        this(name, 20);
        // super();
    }

    E(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}
