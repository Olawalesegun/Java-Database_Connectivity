import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String password = "Martins1@_";
        String sq = "select name from student where sid = 1";
        // import packages
        // register and load driver
        // create connection with database
        // create statement
        // execute statement
        // close connection

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection established");
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(sq);
        System.out.println(rs.next());
        con.close();
        System.out.println("Connection Closed");

        The JDBC as popularly referred to Java Database connectivity acts as an interface or API  for all java files pr programs to connect with different databases. In this repository, you will find my learnings and hands on practice to solidy this concept and build a great understanding for myself.

    }
}