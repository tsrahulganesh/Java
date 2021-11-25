/*package Inheritance;
import java.sql.*;
public class jdbc2 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {


    //loading driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //creating connection
    String user  = "root";
    String pass = "root";
    String url = "jdbc:mysql://localhost:3306/730batch";
    //Connection con = null;
    //Statement   st = null;
        Connection con1 = DriverManager.getConnection(url,user,pass);

    //creating statement
        Statement st = con1.createStatement();
    //executing query
    String sql = "select * from Student";
    ResultSet rs = st.executequery(sql);

    while (rs.next())

    {
        System.out.print(rs.getInt("rno") + "");
        System.out.print(rs.getString("name") + " ");
        System.out.print(rs.getString("branch") + " ");
        System.out.println(rs.getInt("marks"));
    }

    }
}*/
