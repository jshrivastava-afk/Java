import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoPrepared {

	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/activity1","root","root");
        PreparedStatement ps=c.prepareStatement("select * from jdbc");
        ResultSet rs=ps.executeQuery("select * from jdbc");
        System.out.println("Prepared Statement");
        while(rs.next())
        {
     	   
     	   System.out.println(rs.getString(1)+" "+rs.getInt(2));            	   
        }
        c.close();
	}

}
