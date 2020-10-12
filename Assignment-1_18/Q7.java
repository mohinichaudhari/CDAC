//07. Create a program to search student record on the basis of given roll no.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no of student that u want to search");
		int rno =  sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			
			Statement s = con.createStatement();
			
		ResultSet rs =	s.executeQuery("Select * from student1 where rno ="+rno);
		if(rs.first())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
		}
		else
		{
			System.out.println("Record not found");
		}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
