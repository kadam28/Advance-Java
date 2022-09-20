//database connectivity code
import java.sql.*;
import java.io.*;
import java.util.*;

public class PreparedStmtUpdateDemo
{
	public static void main(String args[])throws Exception
	{
	
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("Driver registered successfully!!!");
	    
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	  System.out.println("Connection established successfully!!!");

	  PreparedStatement pstmt=con.prepareStatement("update student set name=? where rollno=?");
	  
	  Scanner sc=new Scanner(System.in);
		  
	  System.out.println("Enter Student Roll No:");
	  int rn=sc.nextInt();
	  System.out.println("Enter Student Name:");
      String nm=sc.next();
	  
	  pstmt.setString(1,nm);
	  pstmt.setInt(2,rn);
	  
	  int x=pstmt.executeUpdate();  
	  System.out.println("No of Rows updated="+x);
	  
	  con.close();
	}
}

