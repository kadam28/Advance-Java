//database connectivity code
import java.sql.*;

public class JDBCInsertRowsDemo
{
	public static void main(String args[])throws Exception
	{
	  //register the OracleDriver class
		
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("Driver registered successfully!!!");
	  
	  //establish connection with the Oracle database
	  
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	  System.out.println("Connection established successfully!!!");
	  
	  //create statement object
	  Statement stmt=con.createStatement();
	  
	  String query="insert into student values(3030,'James')";
	  
	  //execute query
	  int x=stmt.executeUpdate(query);  
	  System.out.println("No of Rows inserted="+x);
	  con.close();
	}
}

