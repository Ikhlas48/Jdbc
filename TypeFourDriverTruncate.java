import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class TypeFourDriverTruncate{
public static void main(String [] args)throws Exception{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");

Statement stmt = con.createStatement();

int n = stmt.executeUpdate("Truncate table student");

stmt.close();
con.close();

}
}