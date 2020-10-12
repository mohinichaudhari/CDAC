package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			Statement s = con.createStatement();
			int i = s.executeUpdate("Insert into student1 values(3,'Mohini',70,'1998-07-26')");
			con.close();
			System.out.println(i+" Record Added Sucessfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
