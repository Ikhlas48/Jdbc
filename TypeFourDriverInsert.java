import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TypeFourDriverInsert{
public static void main (String [] args)throws Exception{

//Step1:-Load the driver
Class.forName("com.mysql.jdbc.Driver");

//Step2:- Connection Establish 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

//Step3:-statement
Statement stmt = con.createStatement();

int n = stmt.executeUpdate("insert into student values(2,'ikhlas',9098233648),(3,'rehan',8234871348)");

System.out.println(n+"Rows affected");
stmt.close();
con.close();
}
}

