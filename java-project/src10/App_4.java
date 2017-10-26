public class App_4 {

    

    public static void main(String[] args) {
       
        
        Score[] scores = {
                new Score("홍길동", 100, 90, 80), 
                new Score("임꺽정", 80, 80, 80), 
                new Score("유관순", 100, 100, 100)
                };
        
        
        
        for (Score s : scores) {
        s.print();
        }

     
        //홍길동, 100, 90, 80, 270, 90.0
        //임꺽정, 80, 80, 80, 240, 80.0
        //유관순, 100, 100, 100, 300, 100.0   
        }
    }
