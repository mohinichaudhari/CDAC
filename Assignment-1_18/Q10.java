//Make a program that displays number of columns present in the given table

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Q10 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			Statement s = con.createStatement();
			
		ResultSet rs = s.executeQuery("select * from student1");
		   ResultSetMetaData rm = rs.getMetaData();
			int n = rm.getColumnCount();
			System.out.println("number of columns: "+n);
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
	
			e.printStackTrace();
		}
		
		
	}
}
