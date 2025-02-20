import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ResultSetPractice{
public static void main (String [] args)throws ClassNotFoundException,SQLException{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

int n = stmt.executeUpdate("delete from sterling where id=4");
ResultSet rs = stmt.executeQuery("select * from sterling");
int type = rs.getType();
int conn = rs.getConcurrency();
System.out.println(type);
System.out.println(conn);
con.close();

}
}

