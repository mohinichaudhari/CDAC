//06. Create a program to perform CRUD operations for student [ rno, name, marks, date of birth ] 
//	using Statement. Take values from keyboard.


package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enetr choice : \n1.Insert the record. \n2.read the record. \n3.update the record. \n4.Delete the record");
		ch = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","mohini1998");
			Statement s = con.createStatement();
			
			switch(ch)
			{
			case 1: System.out.println("Enter Student roll no ");
					int rno=sc.nextInt();
					System.out.println("Enter Student name ");
					String name = sc.next();
					System.out.println("Enter student marks ");
					int marks = sc.nextInt();
					System.out.println("Enter Date of birth");
					String dob = sc.next();
					
					s.executeUpdate("insert into student1 values("+rno+",'"+name+"',"+marks+",'"+dob+"')");
					break;
			
			case 2 : 
					ResultSet rs = s.executeQuery("Select * from student1");
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
					}
					break;
			case 3 :
					System.out.println("Enter roll no of student");
					rno =  sc.nextInt();
					System.out.println("Enter name of student that u want to update");
					name = sc.next();
					s.executeUpdate("update student1 set name = '"+name+"' where rno="+rno);
					break;
			
			case 4 :
					System.out.println("Enter roll no of student that u want to delete");
					rno= sc.nextInt();
					s.executeUpdate("delete from student1 where rno="+rno);
					break;
					
			default : System.out.println("Enetr vaild input");
						break;
			
			
		
								
			
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
