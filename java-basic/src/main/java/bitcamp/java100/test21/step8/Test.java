// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100.test21.step8;

import java.io.Console;
// 8단계: 예외 처리 문법을 도입하여 add()와 get(), main()에 적용한다. 
//        배열의 크기를 벗어나거나 유효하지 않은 인덱스의 
public class Test {
    
    // 콘솔 객체를 준비한다.
    static Console console;
    
    static Contact[] contacts = new Contact[100];
    
    // 값이 저장될 위치
    static int cursor = 0;
    
    // 새 데이터 타입 정의
    static class Contact {
        String name;
        String email;
        String tel;
    }
    
    static void printContacts() {
       // 배열에 저장된 값을 출력한다.
        for (int i= 0; i < size(); i++) {
            Contact contact = get(i);
            System.out.printf("%s, %s, %s\n", 
                    contact.name, 
                    contact.email, 
                    contact.tel);
            }
    }
    
    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n) "); 
        if ((input.toLowerCase().equals("y") ||
             input.toLowerCase().equals("yes")))
            return true;
        return false;
        }
    
    static Contact inputContact() {
 Contact contact = new Contact();
        
        // 사용자가 입력한 데이터를 Contact 인스턴스(객체)에 저장한다.    
        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        
        return contact;
    }
    
    static void add(Contact contact) {
        if (cursor >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스");
        
            return contacts[index];
    }
    
    static int size() {
        return cursor;
    }
    

    public static void main(String[] args) {

        console = System.console();
        
        if ( console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // 에러 출력할 때 알아보기 쉽게 하기 위한 장치 'err'
            System.exit(1); // JVM을 종료한다.
        }
        
        // Contact 값을 저장할 레퍼런스 배열을 만든다.
        // 데이터가 담겨있는 객체, 주소가 100개 라는 말(인스턴스는 100개 만들지 못함)
    

        
        // 배열의 개수 만큼 입력을 받는다.
        while (true) {
            // 사용자가 입력한 데이터를 저장할 메모리 준비.
           
            Contact contact = inputContact();
        
        
        if (confirm("저장하시겠습니까?")) {
            try {
           add(contact);
        } catch (RuntimeException e) {
            System.out.println("최대 저장 개수를 초과하였습니다!");
            break;
        }
    }
       
        
        if (!confirm ("계속 입력하시겠습니까?")) 
            break;  // 위의 내용이 참이 아니라면 계속 실행하라(계속 입력하지 않겠다면 break.)
        }
       
        
        printContacts();
  
    }
}