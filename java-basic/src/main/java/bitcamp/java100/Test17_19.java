package bitcamp.java100;

public class Test17_19 {  

    
    static class My {
        int value;
        
        void print() {
            // My this = 매서드를 호출할 때 앞에 지정한 인스턴스 주소; 
            // => (print를 호출할 때 주소를 받기 위해 존재하는 변수(->this)
            
            System.out.println(this.value);
        }
    }
    
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        // My.printf(); // 컴파일 오류!
        
        r1.print();
        r2.print();
        r3.print();
        
        My m4 = null; // 주소가 없는 상황을 가정하기 위해 null을 저장
        // m4.print(); // 실행 중에 오류 발생(더 위험한 에러)
        
        String s1 = "hello";
        // s1.print(); // 컴파일 오류!
        


        
        
       
    }
    }

