package bitcamp.java100.Test17_17.step2;


public class Test {  


        static float area(int width, int height) {
            return (width * height) / 10000f;
        }
        
        static float pyeong(int width, int height) {
            return (width * height) / 10000f / 3.3f;
        }
        
        
        public static void main(String[] args) {
           
        int width = 390; // 단위 : cm
        int height = 420; // 단위 : cm
        
        System.out.println(area(width, height));
        
        System.out.println(pyeong(width, height));
        


        }
}
      




