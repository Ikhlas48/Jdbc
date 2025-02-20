import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class TypeFourDriverDelete{
public static void main(String args [])throws Exception{

//Step:-1 load Driver;
Class.forName("com.mysql.jdbc.Driver"); 


//Step:-2 Connection Establish

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

//Step:-3 Statement

Statement stmt = con.createStatement();


int n = stmt.executeUpdate("delete from student where id=2");

System.out.println(n+"Rowaffected");

stmt.close();
con.close();

}
}