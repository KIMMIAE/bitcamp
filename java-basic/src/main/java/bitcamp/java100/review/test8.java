package bitcamp.java100.review;

import java.io.Console;

public class test8 {
 // 6단계: 코드를 기능별로 분리하여 메서드 안에 묶어 두기 
    public class Test {
        
        // 콘솔 객체를 준비한다.
        static Console console;
        
        // Contact 값을 저장할 레퍼런스 배열을 만든다.
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
            for (int i = 0; i < cursor; i++) {
                System.out.printf("%s, %s, %s\n", 
                        contacts[i].name, 
                        contacts[i].email, 
                        contacts[i].tel);
            }
        }
        
        static boolean confirm(String message) {
            String input = console.readLine(message + "(y/n) ");
            if (input.toLowerCase().equals("y") || 
                  input.toLowerCase().equals("yes"))
                return true;
            return false;
        }
        
        static Contact inputContact() {
            // 사용자가 입력한 데이터를 저장할 메모리 준비
            Contact contact = new Contact();
            
            // 사용자가 입력한 데이터를 Contact 인스턴스(객체)에 저장한다.
            contact.name = console.readLine("이름? ");
            contact.email = console.readLine("이메일? ");
            contact.tel = console.readLine("전화? ");
            
            return contact;
        }

        public static void main(String[] args) {
            
            console = System.console();
            
            if (console == null) {
                System.err.println("콘솔을 지원하지 않습니다.");
                System.exit(1); // JVM을 종료한다.
            }
            
            // 배열의 개수 만큼 입력을 받는다.
            while (cursor < contacts.length) {
                
                Contact contact = inputContact();
                
                if (confirm("저장하시겠습니까?")) {
                    // 이름, 이메일, 전화 데이터가 들어있는 인스턴스 주소를 배열에 저장.
                    contacts[cursor] = contact;
                    cursor++;
                }
                
                if (!confirm("계속 입력하시겠습니까?"))
                    break;
            }
            
            printContacts();
            
        }
    }


}
