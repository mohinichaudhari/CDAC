import java.util.Scanner;

//60.	Create Interface StudentFee and declare following method.  
//getFee() throws InvalidFeeException. This method ask fees from user 
//and throws exception if user enters invalid or negative fees Create 
//class Student with members (name, fees) and implement the 
//StudentFee Interface.
interface StudentFee{
	void getFee();
}
class Student implements StudentFee{
	String name;
	int fees;
	
	@Override
	public void getFee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fees for student : ");
		fees= sc.nextInt();
		if(fees <= 0)
		{
			try {
				throw new Exception("InvalidFeeException");
			} catch (Exception e) {

				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Fees = "+fees);
		}
		
	}
	
}


public class Q60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		String name = sc.next();
		Student s = new Student();
		s.getFee();
	}

}
