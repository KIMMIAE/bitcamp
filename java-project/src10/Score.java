
public class Score {
    String name;
    int[] subjects = new int[3];
    int sum;
    float aver;
    
    //: ### 생성자
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
    
    

    
    
}
