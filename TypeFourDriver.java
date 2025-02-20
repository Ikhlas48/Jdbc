import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class TypeFourDriver{
public static void main(String [] args) throws Exception{

// Step 1: Load the Driver
Class.forName("com.mysql.jdbc.Driver");

//Step 2: Connection Establishment
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

//Step3:- Statement 	
Statement stmt = con.createStatement();

int n = stmt.executeUpdate("create table student(id int,name varchar(20),mobile_no bigint(12))");

System.out.println(n+"Rows affected");
 stmt.close();
con.close();
}
}