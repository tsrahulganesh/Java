package Inheritance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

    //Loading driver

    public static void main(String[]args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");


        //creating connection

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";

        Connection con = DriverManager.getConnection(url, user, pass);

        //creating statement
        Statement st = con.createStatement();
        //Executing query (DML =data manupulation langaugue)
        String sql = "insert into student values(2,'anjali','IT',77)";
         //String sql ="update student set rno =10 where name='anjali'";
        //String sql = "delete from student where rno=10";
        //st.executeUpdate(sql);
        st.executeQuery(sql);
    }
}
