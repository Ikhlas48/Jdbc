import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SoftCodedScanner{
public static void main (String [] args)throws ClassNotFoundException, SQLException{

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");


Scanner s = new Scanner(System.in);

System.out.print("enter your id :");
int id = s.nextInt();

s= new Scanner(System.in);
System.out.print("Enter your Name :");
String name = s.nextLine();

System.out.print("Enter your mobile_no :");
long mobile_no = s.nextLong();

Statement stmt = con.createStatement();

String completeQuery = String.format("insert into student values(%d, '%s', '%d')",id ,name ,mobile_no);

System.out.println(completeQuery);

int ch = stmt.executeUpdate(completeQuery);
System.out.println(ch+ "roW(s) affected");



con.close();
stmt.close();

}
}