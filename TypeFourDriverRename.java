import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class TypeFourDriverRename{
public static void main(String [] args)throws Exception{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");

Statement stmt = con.createStatement();

int n = stmt.executeUpdate("Rename table Student to Student1");

stmt.close();
con.close();

}
}