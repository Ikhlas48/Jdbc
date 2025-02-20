import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class TypeFourDriverAlter{
public static void main(String [] args)throws Exception{

Class.forName("com.mysql.jdbc.Driver");

System.out.println("Class Load Successfully");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");

System.out.println("Connection establish Successfully");

Statement stmt = con.createStatement();

System.out.println("open statement");

int n = stmt.executeUpdate("alter table student1 add Adhar_no bigint age int");

stmt.close();
con.close();
}
}

