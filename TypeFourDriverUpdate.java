import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TypeFourDriverUpdate{
public static void main(String [] args)throws Exception{

//Step:-1 class load
Class.forName("com.mysql.jdbc.Driver");

//Step:- Connection establish;
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

//Step:-3 Statement

Statement stmt = con.createStatement();

int n = stmt.executeUpdate("UPDATE student set id=2 where id = 3");

System.out.println(n+"Row affected");

stmt.close();
con.close();

}
}