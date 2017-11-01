// 제네릭(Generic) 적용 후
package bitcamp.java100.ch09.ex6;

public class Test2 {
    
    public static void main(String[] args) {
        
        Stack2<Contact> contacts = new Stack2<>();
        
        contacts.push(new Contact("홍길동", "h@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "L@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "Y@test.com", "1111-1113"));
        
        
        //contacts.push(new String("안중근")); // 컴파일 오류!
        //contacts.push(new Boolean(true)); // 컴파일 오류!
        
        //Contact c = contacts.pop(); // 컴파일 오류!
        Contact c = (Contact)contacts.pop();
        
        
        Stack2<Book> bookStack = new Stack2<>();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        // 예2) ContactStack
        
        Stack2<Contact> contactStack = new Stack2<>();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        
        // 예3) ScoreStack
        
        Stack2<Score> scoreStack = new Stack2<>();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
 
        //scoreStack.push(new String("Hello")); // 컴파일 오류!
        //scoreStack.push(new String(10)); // 컴파일 오류!
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
       
        
        

    }

}
