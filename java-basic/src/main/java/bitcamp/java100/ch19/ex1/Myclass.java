package bitcamp.java100.ch19.ex1;

@MyAnnotation
//@MyAnnotation//오류! 중복해서 붙일 수는 없다!
public class Myclass {
    
    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m() {
        //@MyAnnotation
        System.out.println("Hello!!!!");
    }
    
    public void m2(@MyAnnotation int a, String b) {}

}
