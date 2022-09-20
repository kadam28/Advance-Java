/*
Calling stored procedure
*/
import java.sql.*;
public class CallableStmtDemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
		CallableStatement cstmt=con.prepareCall("{call vjtech123(7777,'Vish')}");
	/*	cstmt.setInt(1,6666);
		cstmt.setString(2,"Suman");*/
		cstmt.execute();
		con.close();
	}
}