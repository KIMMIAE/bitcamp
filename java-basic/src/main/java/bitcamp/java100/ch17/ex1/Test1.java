package bitcamp.java100.ch17.ex1;

public class Test1 {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        System.out.println(driver.getMajorVersion());
        System.out.println(driver.getMinorVersion());
        System.out.println(driver.toString());

    }

}
