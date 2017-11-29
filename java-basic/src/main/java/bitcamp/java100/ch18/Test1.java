// Re

package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test1 {

    public static void main(String[] args) throws Exception {

        // Class 라는 클래스 
        // - 클래스 정보를 다룰 때 사용하는 클래스이다.
        // - 클래스가 로딩되면 클래스에 대한 정보를 다루는 Class 객체가 생성된다.
        // - 로딩된 모든 클래스는 자신의 정보를 갖고 있는 
        // 스태틱 변수 "class"를 내장하고 있다.
        
        // 방법1) Class 객체 얻기 
        // - 문자열로 클래스 이름을 받기 때문에 다양한 클래스를 로딩할 수 있다.
        
        Class<?> c1 = Class.forName("java.io.BufferedReader"); // <?> => ? =>'아무거나'라는 의미
        
        // 방법2)
        // - 직접 코드에서 클래스를 지정하고 내장 변수 "class"를 사용할 수 있다.
        // - 하드 코딩이기 때문에 다른 클래스로 바꾸려면 코드를 변경해야 한다.
        Class<?> c2 = java.io.BufferedWriter.class;
        
        // 방법3)
        // - 인스터스에 대해 getClass()를 호출하여 얻을 수 있다.
        // - 인스턴스가 주어진 상태에서 클래스 도구를 얻을 때 유용하다.
        StringWriter in = new StringWriter();
        
        Class<?> c3 = in.getClass();
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        
    }

}
