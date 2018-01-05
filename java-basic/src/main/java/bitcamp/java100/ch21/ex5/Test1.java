package bitcamp.java100.ch21.ex5;

public class Test1 {

	public static void main(String[] args) {
		
		XProxy xProxy = new XProxy();
		
		Front obj = new Front();
		
		obj.x = xProxy;
		

		obj.test("홍길동");
		
		System.out.println("--------------------------------------");
		
		obj.test(null);
		
		
	}
}
