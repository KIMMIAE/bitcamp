class asdf{
    static int makeArrayConsecutive2(int[] statues) {
        int min = statues[0];
        int max = 0;
        int result = 0;
        for(int i = 0; i < statues.length; i++ ){
            if(statues[i]>max) { max = statues[i];}
            if(statues[i]<=min) { min = statues[i];}
        }
        result = max - min - statues.length + 1;
        
        return result;
    }


    public static void main(String[] args) {
        int[] statues = {2, 3, 6};
        System.out.println(makeArrayConsecutive2(statues));
    }
}


