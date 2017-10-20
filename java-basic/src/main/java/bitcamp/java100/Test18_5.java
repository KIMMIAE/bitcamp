package bitcamp.java100;

public class Test18_5 {

    public static void main(String[] args) throws Exception {
        
        String s1 = "ABC가각간";
        
        // replace()
        
        String s2 = s1.replace("BC", "하하하");
        
        System.out.println(s1);
        System.out.println(s2);
        // String 인스턴스의 값은 한 번 정해지면 변경할 수 없음 = "immutable object"라 부름.
        
        
        System.out.println(s1.charAt(4));
        
        s1 = "ABBCDEBBFGH";
        
        System.out.println(s1.indexOf("BB"));
        
        
        System.out.println(s1.lastIndexOf("BB"));
        
        System.out.println(s1.substring(3));
        
        System.out.println(s1.substring(3, 6));
        
        s1 = "홍길동";
        
        System.out.println(s1.startsWith("홍길"));
        System.out.println(s1.startsWith("길"));
        
        System.out.println(s1.endsWith("동"));
        System.out.println(s1.endsWith("원"));
        
       s1 = "홍길동,유관순,임꺽정,윤봉길,이육사,윤동주";
       
       System.out.println(s1.contains("꺽정"));
       
       System.out.println(s1.contains("김꺽정"));
       
       
       String s3 = "ABC";
       String s4 = "가각간";
       
       System.out.println(s3.concat(s4));
       
       System.out.println(s3);
       System.out.println(s4);
       
       s3 = new String("탕수육");
       s4 = new String("탕수육2");
       String s5 = new String("탈수육");
       String s6 = new String("탕수육");
       
       
       // compareTo(비교문자열)
       // > 두 문자열을 비교하여 같으면 0을 리턴한다.
       System.out.println(s3.compareTo(s6));
       System.out.println(s3.compareTo(s4));
       System.out.println(s3.compareTo(s5));
       
       s1 = "홍길동";
       s2 = "";
       s3 = null; // 인스턴스 없음
       
       System.out.println(s1.isEmpty());
       System.out.println(s2.isEmpty());
       // System.out.println(s3.isEmpty()); // 컴파일 오류!
       // => 빈문자열과 String 인스턴스 없음은 다르다! 빈문자열도 String 인스터스이다.
       
       System.out.println(s1.length());
       System.out.println(s2.length());
       // System.out.println(s3.length()); // 인스턴스가 없으면 실행오류!
       
       s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
       
       String[] arr = s1.split(",");
       for (String s : arr) {
           System.out.print(s);
           System.out.print("-");
       }
       
       System.out.println();

       arr = s1.split(" ");
       System.out.println(arr.length);
       System.out.println(arr[0]);
       
       s1 = "";
       arr = s1.split(" ");
       System.out.println(arr.length);
       System.out.println(arr[0]);
       
       s1 = "Hong Gil Dong";
       System.out.println(s1.toLowerCase());
       System.out.println(s1.toUpperCase());

       s1 = "  홍길동 ";
       System.out.print(">");
       System.out.print(s1.trim());
       System.out.println("<");
       
       
       // => 중간 공백은 날리지 않음.
       s1 = "  홍  길 동 ";
       System.out.print(">");
       System.out.print(s1.trim());
       System.out.println("<");
       
       
       // => 해당 문자열의 양쪽에 존재하는 공백(white space)을 제거한다.
       s1 = "  \t홍\t길 동 \n입니다. \n\n\n\t\n";
       System.out.print(">");
       System.out.print(s1.trim());
       System.out.println("<");
       
       // 공백(white space)?
       // - 스페이스(스페이스 바를 눌러 추가한 빈 칸 한 개), 탭, 줄바꿈 모두 공백으로 취급한다.
       
       s1 = "ABC\n가각간\n똘똠똥";
       
       
       byte[] bytes = s1.getBytes();
       for (byte b : bytes) {
           System.out.print(Integer.toHexString(b & 0x00ff));
           System.out.print(" ");
       }
       System.out.println();
       
       bytes = s1.getBytes("UTF-8");
       for (byte b : bytes) {
           System.out.print(Integer.toHexString(b & 0x00ff));
           System.out.print(" ");
       }
       System.out.println();
       
       s1 = String.valueOf(true);
       s2 = String.valueOf(3.14);
       s3 = String.valueOf(100);
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       // 문자열을 다루는 특별한 연산자 '+'
       
       s1 = "ABC";
       s2 = "가각간";
       s3 = s1 + s2;
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       

      
       
       }
       
    }



