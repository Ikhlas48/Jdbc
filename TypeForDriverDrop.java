import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TypeForDriverDrop{
public static void main(String [] args)throws Exception{

//Step:-1 class load
Class.forName("com.mysql.jdbc.Driver");
System.out.println("class loaded succesfull");

//Step:-2 Connection establish

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");
System.out.println("Connection establish Successfully");

//Step:-3 Statement

Statement stmt = con.createStatement();
System.out.println("open Statement Successfully");

int n = stmt.executeUpdate("drop table student");

stmt.close();
con.close();

}
}

