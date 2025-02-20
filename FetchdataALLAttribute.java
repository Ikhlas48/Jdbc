import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchdataALLAttribute{
public static void main(String [] args)throws Exception{

System.out.println(ResultSet.TYPE_FORWARD_ONLY);
System.out.println(ResultSet.TYPE_SCROLL_INSENSITIVE);
System.out.println(ResultSet.TYPE_SCROLL_SENSITIVE);
System.out.println(ResultSet.CONCUR_READ_ONLY);
System.out.println(ResultSet.CONCUR_UPDATABLE);


}
}
