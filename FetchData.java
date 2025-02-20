import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;


public class FetchData {
public static void main(String [] args)throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	Statement stmt = con.createStatement();
	boolean flag = stmt.execute("select * from sterling");
	
	System.out.println(flag);
	
	ResultSet rs = stmt.getResultSet();
	
	while(rs.next()) {
		
		System.out.println(rs.getString("id")+ "\t\t" + rs.getString("Name") + "\t\t"+ rs.getString("age"));
	}
	con.close();
}
}