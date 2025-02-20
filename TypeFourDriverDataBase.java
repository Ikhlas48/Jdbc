import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class TypeFourDriverDataBase{
public static void main(String [] args)throws Exception{

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
Statement stmt = con.createStatement();

int n = stmt.executeUpdate("create table Sterling(id int primarykey,name varchar(20),age int not null ,mobileno bigint(12))");

System.out.println(n+"Row affected");

con.close();
stmt.close();

}
}
