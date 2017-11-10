
// 파일입출력/네트워트/DB 때 씀
package bitcamp.java100.ch13.ex3;

public class Test3 {

    public static void main(String[] args) {
        class MyClass{}
        class MyClass2 implements AutoCloseable{
            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");
            }
        }
        try (
                //MyClass obj = new MyClass(); 
                
                MyClass2 obj2 = new MyClass2();
               )
        { System.out.println("try 블록 실행!");
            int r = 20/ 0;
            } catch (Exception e) {
            System.out.println("catch 블록 실행!"); } 

    }

}