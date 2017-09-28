package bitcamp.java100;

public class Test14_3 {  
	public static void main (String[] args) {

       class Student {
           String name;
           String region;
           int age;
           int classroom;
           String phonenumber;
           boolean gender;
       }
           
       Student s1;

       s1 = new Student();

       s1.name = "김미애";
       s1.region = "경기도";
       s1.age = 26;
       s1.classroom = 504;
       s1.phonenumber = "010-0000-0000";

       System.out.printf("%s, %s, %d, %d, %f\n", s1.name, s1.region, s1.age, s1.classroom, s1.phonenumber);
        

    }
}