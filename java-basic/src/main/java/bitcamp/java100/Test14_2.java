package bitcamp.java100;

public class Test14_2 {  
    
    public static void main (String[] args) {

       class Book {
           String name;
           String author;
           String pub;
           int page;
           double price;
       }
           
       Book b1;

       b1 = new Book();

       b1.name = "java커피";
       b1.author = "호잇";
       b1.pub = "비트캠프";
       b1.page = 1020;
       b1.price = 35000;

       System.out.printf("%s, %s, %s, %d, %f\n", b1.name, b1.author, b1.pub, b1.page, b1.price);
        

    }
}