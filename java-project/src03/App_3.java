public class App_3 {

    public static void main(String[] args) {
        
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.subjects[0] = 100;
        s1.subjects[1] = 90;
        s1.subjects[2] = 80;
        for (int sub : s1.subjects) {
            s1.sum += sub;
        }
        s1.aver = s1.sum / 3f;
        
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.subjects[0] = 80;
        s2.subjects[1] = 80;
        s2.subjects[2] = 80;
        for (int sub : s2.subjects) {
            s2.sum += sub;
        }
        s2.aver = s2.sum / 3f;
        
        Score s3 = new Score();
        s3.name = "유관순";
        s3.name = "임꺽정";
        s3.subjects[0] = 100;
        s3.subjects[1] = 100;
        s3.subjects[2] = 100;
        for (int sub : s3.subjects) {
            s3.sum += sub;
        }
        s3.aver = s3.sum / 3f;

        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                s1.name, s1.subjects[0], s1.subjects[1], s1.subjects[2], s1.sum, s1.aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                s2.name, s2.subjects[0], s2.subjects[1], s2.subjects[2], s2.sum, s2.aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                s3.name, s3.subjects[0], s3.subjects[1], s3.subjects[2], s3.sum, s3.aver);
     
        //홍길동, 100, 90, 80, 270, 90.0
        //임꺽정, 80, 80, 80, 240, 80.0
        //유관순, 100, 100, 100, 300, 100.0
        }
    }
