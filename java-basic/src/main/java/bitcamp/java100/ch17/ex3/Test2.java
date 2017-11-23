package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner key = new Scanner(System.in);
        
        System.out.print("변경할 게시물 번호?");
        String no = key.nextLine();
        System.out.print("제목? ");
        String title = key.nextLine();
        System.out.print("내용? ");
        String contents = key.nextLine();
        
        
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");

        PreparedStatement pstmt = con.prepareStatement(
                "update jdbc_test set title=?, conts=? where no=?");
        
        pstmt.setString(1, title);
        pstmt.setString(2, contents);
        pstmt.setString(3, no);
        pstmt.executeUpdate();
        
        System.out.println("실행 완료");


        key.close();
        pstmt.close();
        con.close();

    }

}
