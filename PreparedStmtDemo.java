//database connectivity code
import java.sql.*;
import java.io.*;
import java.util.*;

public class PreparedStmtDemo
{
	public static void main(String args[])throws Exception
	{
	
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("Driver registered successfully!!!");
	    
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	  System.out.println("Connection established successfully!!!");

	  PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?)");
	  
	  Scanner sc=new Scanner(System.in);
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("Enter Student Roll No:");
		  int rn=sc.nextInt();
		  System.out.println("Enter Student Name:");
		  String nm=sc.next();
		  
		  pstmt.setInt(1,rn);
		  pstmt.setString(2,nm);
		  
		  int x=pstmt.executeUpdate();  
		  System.out.println("No of Rows inserted="+x);
	  }
	  con.close();
	}
}

