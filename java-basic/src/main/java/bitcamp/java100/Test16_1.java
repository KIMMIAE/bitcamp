package bitcamp.java100;

public class Test16_1 {  
    
    public static void main(String[] args) {

        int a = 100;
        
        {
           // int a = 200;
            
            System.out.println(a);
            
            
            int b = 200;
            
            System.out.println(b);
            {
                System.out.println(b);
                int c = 300;
                System.out.println(c);
                
            }
            // System.out.println(c); // 컴파일 오류!
        }
       
        System.out.println(a);
        // System.out.println(b); // 컴파일 오류!
        
        int c = 300;
        
         }
    }
 