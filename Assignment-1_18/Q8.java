//08. Create a program to display average marks obtained by the student.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q8 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select marks from student1");
			int sum =0;
			int count=0;
			while(rs.next())
			{
				sum = sum+rs.getInt(1);
				count++;
			}
			float avg = sum/count;
			System.out.println("average of all the marks is :" +avg);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
