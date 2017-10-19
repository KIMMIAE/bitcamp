package bitcamp.java100;

import java.io.Console;
import java.text.Format;
import java.util.ArrayList;

public class Test000 {

    public static void main(String[] args) {

        class Impormation {
            String name ;
            String mail ;
            String number ;
        }
        /////////////////////////////////////////////////////////
        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        ////////////////////////////////////////////////////////

        Impormation i = new Impormation();

        ArrayList names = new ArrayList();
        ArrayList mails = new ArrayList();
        ArrayList numbers = new ArrayList();

        while(true) {
            i.name = console.readLine("이름? ");
            i.mail = console.readLine("메일? ");
            i.number = console.readLine("전화? ");

            if(console.readLine("저장하시겠습니까? (y/n) ").equals("y") == true) {
                names.add(i.name);
                mails.add(i.mail);
                numbers.add(i.number);
                System.out.println("저장하였습니다");
            }
            else System.out.println("저장을 취소하셨습니다.");
            
            if(console.readLine("계속하시겠습니까?? (y/n) ").equals("y") == true) 
                continue;
            else break;
        }
        System.out.println();
        for(int x = 0; x < names.size(); x++) {
            System.out.printf("%s\t",names.get(x));
            System.out.printf("%s ",mails.get(x));
            System.out.printf("%s\n",numbers.get(x));
        }
    }
}


