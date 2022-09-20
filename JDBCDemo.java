//database connectivity code
import java.sql.*;

public class JDBCDemo
{
	public static void main(String args[])throws Exception
	{
	  //register the OracleDriver class
		
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("Driver registered successfully!!!");
	  
	  //establish connection with the Oracle database
	  
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	  System.out.println("Connection established successfully!!!");
	 
	  con.close();
	}
}

