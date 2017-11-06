package java100.app;

import java.util.Scanner;

public class Board2 {
    protected int num;
    protected String tittle;
    protected String content;
    
    public Board2() {}
    
    public Board2(int num, String tittle, String content) {
        this.num = num;
        this.tittle = tittle;
        this.content = content;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("번호? ");
        this.num = Integer.parseInt(num, keyScan.nextInt());
        
        System.out.print("제목? ");
        this.tittle = keyScan.nextLine();
        
        System.out.print("내용? " );
        this.content = keyScan.nextLine();
    }

    public void print() {
        System.out.printf("%-4d, %s, %s\n",  
                this.num, 
                this.tittle,
                this.content);
        
    }
    

}
