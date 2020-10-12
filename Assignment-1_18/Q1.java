//01. Create a program to create table named student having columns 
//[ rno, name, marks, date of birth].


package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Q1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			Statement s = con.createStatement();
			boolean b =  s.execute("create table student1(rno int,name varchar(20),marks int,DOB date)");
			con.close();
			System.out.println(b);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
