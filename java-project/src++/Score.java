import java.util.Scanner;

public class Score { 
    
    String name;
    int[] subjects;
    int sum;
    float aver;
    

    //: ### 생성자
    
    // > 빈 객체를 만드는 경우
    Score() {
        this.subjects = new int[3];
    }
    // > 객체를 만들 때 바로 초기화 시키는 경우
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};
        
        this.compute();
    }
    
    //: ###인스턴스 메서드
    void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
        }
    void input() {
        Scanner keyScan = new Scanner(System.in);
    
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        this.subjects = new int[3];
        
        System.out.print("국어? ");
        this.subjects[0] = keyScan.nextInt();
    
        System.out.print("영어? ");
        this.subjects[1] = keyScan.nextInt();
    
        System.out.print("수학? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
        
        }

    }
    
    

    
    
