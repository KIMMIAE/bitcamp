public class test03 {

    public static void main(String[] args) {
        
        String[] names = {"홍길동", "임꺽정", "유관순"};
        int[] kor = {80, 90, 100};
        int[] eng = {90, 70, 100};
        int[] math = {100, 100, 100};

        for(int i = 0; i < names.length; i++) {
            int sum = kor[i] + eng[i] + math[i];
            float aver = sum /3.0f;
            System.out.printf("%-4s, %4d, %4d, &4d, %4d, %6.1f\n", names[i], eng[i], kor[i], math[i], sum, aver);
        }
    }
}
    