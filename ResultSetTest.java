import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;



public class ResultSetTest{

public static void main (String [] args)throws Exception{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");

Statement stmt = con.createStatement();

ResultSet rs = stmt.executeQuery("Select * from Sterling");

while(rs.next()){
System.out.println(rs.getInt("Id")+"\t"+rs.getString("name")+"\t"+rs.getInt("age")+"\t"+rs.getDate("dob")+"\t"+rs.getTime("tob")+"\t"+rs.getTimestamp(5));

}

rs.close();
stmt.close();
con.close();
}
}