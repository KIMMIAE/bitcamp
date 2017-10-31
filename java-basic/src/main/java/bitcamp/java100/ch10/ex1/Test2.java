// 중첩 클래스(nested class)
package bitcamp.java100.ch10.ex1;

public class Test2 {
    // static(=Top level(옛날엔)) nested class
    static class A {}
    // non-static nested class = Inner class
    class B {}
    
    // 익명 클래스
    Object obj = new Object() {
        String name;
        public void m1() {}

    };
    
    public static void main(String[] args) {
        
        // 로컬 클래스
        class C {}
        
        // 익명 클래스
        Object obj2 = new Object() {
            String name;
            public void m1() {}

        };
    }

}
