//05. Create a program to display no. of student records present in the table.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			
			Statement s = con.createStatement();
			int i=0;
		ResultSet rs = 	s.executeQuery("Select rno from student1");
			while(rs.next())
			{
				i++;
			}
			System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
