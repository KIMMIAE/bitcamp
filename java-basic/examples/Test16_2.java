package bitcamp.java100;

public class Test16_2 {  
    
    public static void main(String[] args) {
        
        int age = 27;
        if (age <= 19) System.out.println("미성년"); else System.out.println("성년");
        
        // 위나 아래나 똑같은 내용. 줄바꿈과 들여쓰기 된다는 걸 보여주기 위한 예제.
        
        age = 17;
        if (age <= 19) 
            System.out.println("미성년"); 
        else 
            System.out.println("성년");
        
        if (age > 65);
            System.out.println("경로우대 대상자입니다.");
            
        System.out.println("---------------------------------------");
            
        age = 57;
            
            System.out.println("경로우대 대상자가 아닙니다..");
                
        System.out.println("---------------------------------------");
                
                age = 17;
                
                if (age <= 19)
                    System.out.println("미성년입니다.");
                    System.out.println("청소년 할인은 받을 수 있습니다.");
                    
        System.out.println("---------------------------------------");
        
        if (age <= 19) {
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인은 받을 수 있습니다.");
       
        System.out.println("---------------------------------------");
               
        age = 67;
        
        if (age <= 19)
            if (age > 13)
            System.out.println("청소년");
        
        System.out.println("---------------------------------------");
        
        age = 27;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("성년");
        // => 값이 출력 안되는 이유 : 항상 else는 가까운 if에 묶인다
        
        System.out.println("---------------------------------------");
        
        age = 27;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
        } else
                System.out.println("성년");
        
        System.out.println("---------------------------------------");
        
        age = 27;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        
        
        System.out.println("---------------------------------------");
        
        age = 17;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        
        System.out.println("---------------------------------------");
        
        age = 13;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        
        System.out.println("---------------------------------------");
        
        age = 23;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
            else
                System.out.println("성년입니다.");
        
        System.out.println("---------------------------------------");
        
        age = 72;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        else
            if (age < 65)
            System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");
        
        System.out.println("---------------------------------------");
        
        age = 72;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        } 
        else {
            if (age < 65)
            System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");
            
            
        System.out.println("---------------------------------------");
        
        age = 72;
        
        if (age < 8)
            System.out.println("유아");
        else
            if (age < 14)
                System.out.println("어린이");
            else
                if (age < 20)
                    System.out.println("청소년");
                else
                    if (age < 65)
                        System.out.println("성년");
                    else
                        System.out.println("노인");
        
        System.out.println("---------------------------------------");
        
        age = 72;
        
        if (age < 8)
            System.out.println("유아");
        else if (age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if (age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");
        
        System.out.println("---------------------------------------");
        
        age = 72;
        
        if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("어린이");
        } else if (age < 20) {
            System.out.println("청소년");
        } else if (age < 65) {
            System.out.println("성년");
        } else {
            System.out.println("노인");
        }
        }
        
        }
         }
    }
 