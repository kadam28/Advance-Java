//database connectivity code
import java.sql.*;

public class JDBCUpdateRowDemo
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
	  
	  String query="update student set name='Modi' where rollno=2020";
	  
	  //execute query
	  int x=stmt.executeUpdate(query);  
	  System.out.println("No of Rows updated="+x);
	  con.close();
	}
}

