/*
Fetch database table details in Java program and display it in reverse order
*/
import java.sql.*;
public class JDBCSelectRowsDemo
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",
		"system");
		
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		String query="select * from student";
		
		ResultSet rs=stmt.executeQuery(query);
		
		System.out.println("*******************************************");
		System.out.println("*************STUDENT DB TABLE**************");
		System.out.println("*******************************************");
		System.out.println("ROLLNO\tNAME");
		System.out.println("=============================");
		rs.afterLast();
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		con.close();
		
	}
}