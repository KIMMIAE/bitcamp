package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate("update jdbc_test set title='xxx', conts='xxxx' where no=1");
      
        
        System.out.println("변경 완료!");
        
        stmt.close();
        con.close();

    }

}
