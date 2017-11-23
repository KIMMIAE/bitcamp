package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate("insert into jdbc_test(title,conts,regdt)"
                + " values('aaa','aaaa',now())");
        
        System.out.println("입력 완료!");
        
        stmt.close();
        con.close();

    }

}