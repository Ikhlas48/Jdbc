import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FetchDataAttribute{
static public void main(String... abc)throws ClassNotFoundException, SQLException{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

ResultSet rs = stmt.executeQuery("Select * from sterling");

int type = rs.getType();
int conn = rs.getConcurrency();

System.out.println(type);
System.out.println(conn);
rs.next();
System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
System.out.println();


rs.close();
stmt.close();
con.close();

}
}