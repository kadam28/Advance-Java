/*
Fetch database table details in Java program and display it
*/
import java.sql.*;
public class JDBCSelectRowsDemo1
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",
		"system");
		
		Statement stmt=con.createStatement();
		
		String query="select * from student";
		
		ResultSet rs=stmt.executeQuery(query);
		
		System.out.println("*******************************************");
		System.out.println("*************STUDENT DB TABLE**************");
		System.out.println("*******************************************");
		System.out.println("ROLLNO\tNAME");
		System.out.println("=============================");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		con.close();
		
	}
}