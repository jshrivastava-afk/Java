import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class DemoCallable {
 
	public static void main(String[] args) throws SQLException
	{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/activity1","root","root");
		CallableStatement cs= (CallableStatement) c.prepareCall("{}");
		
	}
}
