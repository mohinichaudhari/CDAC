import java.util.Scanner;
class Fifteen{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the gender (f/m) :");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the age :");
		int age = sc.nextInt();

		if(gender == 'm' && age>=21)
		{
			 System.out.println("Men Eligible for Marraige");
		}
		else if(gender == 'f' && age>=18)
		{
			 System.out.println("Women Eligible for Marraige");
		}
		else
		{
			 System.out.println("Not Eligible for Marrage");
		}
	}
}