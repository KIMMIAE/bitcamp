package bitcamp.java100.ch11.ex6;

public abstract class C {
    int v1;
    
    public void m1() {
        System.out.println("C.m1()");
    }
    
    //public abstract void m1() {} // 추상 메서드는 구현하면 안됨!
    
    public abstract void m2();

}
