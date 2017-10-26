// 상속 - Object 클래스의 주요 메서드
// - Object 클래스에는 모든 객체가 반드시 가져야 할 최소한의 메서드를 제공한다.
// - 주요 메서드
// toString()
//   => 인스턴스에 대해 간단한 정보를 문자열로 리턴한다.
//   => 클래스명@인스턴스를 식별하는 hash값
// toString()
// equals()
// hashCode()
// getClass();

package bitcamp.java100.ch07.ex4;

public class Test2 {
    // 모든 클래스에는 그 클래스의 정보가 담겨있는 인스턴스의 주소를 가지고 있다.
    // 어느 변수에?
    // => static Class class = ...;

    public static void main(String[] args) {

        Test2 obj = new Test2();

        // toString()
        // => 인스턴스에 대해 간단한 정보를 문자열로 리턴한다.
        // => 클래스명@인스턴스식별하는hash값

        System.out.println(obj.toString());

        // hashCode()
        // => hash값? 각 인스턴스를 구별할 때 사용할 디지털 지문!
        // Object 클래스에서 제공하는 toString()은 항상
        // 인스턴스마다 고유의 해시값을 리턴한다.
        // => 비록 인스턴스가 다르더라도 같은 내용을 갖는 경우
        // 같은 해시코드를 리턴하고 싶다면,
        // 서브 클래스에서 이 메서드를 재정의하라!
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println("----------------------------------------------");
        
        // equals()
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));

        System.out.println("----------------------------------------------");
        
        String s1 = new String("hello!");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        System.out.println("----------------------------------------------");
        
        // StringBuffer
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        //getClass()
        
        Class c = obj.getClass();
        System.out.println(c.getName());
        
    }
}
