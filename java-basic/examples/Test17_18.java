package bitcamp.java100;

public class Test17_18 {  

    
    static class My {
        int value;
        
        static void printf(My ref) {
            System.out.println(ref.value);
            // System.out.println(this.value); // 컴파일 오류! // class는 내용변수 this가 생성되지 않는다.
        }
    }
    
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        My.printf(r1);
        My.printf(r2);
        My.printf(r3);
        
        
        
        
       
    }
    }

