package bitcamp.java100;

public class Test18_6 {

    public static void main(String[] args) throws Exception {
        String email = "hong@test.com";
        
        // match(정규표현식=Regular Expression)
        System.out.println(email.matches("1hong@test.com"));
        
        // > . : 임의의 문자 한 개
        // +(한 개 이상), *(0 개 이상), ?(0 또는 한 개)
        // \. : 그냥 dot 문자
        
        System.out.println(email.matches(".+@.+\\..+"));
        
        // \D : 숫자를 제외한 문자
        
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        
        //java.util.regex.Pattern 클래스의 API 문서를 참조하라.
        
        
        System.out.println("---------------------------------------");
        
        
        
        String str = "홍길동(hong@test.com), 임꺽정(leem@test.com)," +
                     "유관순(yoo@test.com), 안중근(ahn@test.com), 윤봉길(yoon@test.com)";
        
        java.util.regex.Pattern pattern = 
                java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int startIndex = 0;
        while (matcher.find(startIndex)) {
            System.out.println(startIndex);
            String matchString = matcher.group();
            startIndex = matcher.end() + 1;
            System.out.println(matchString);
        }
        
        

      
       
       }
       
    }



