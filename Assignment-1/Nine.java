import java.util.Scanner;
class Nine{
	public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of days : ");
		int d = sc.nextInt();
		int year,month,days;
		
		year = d/365;
		System.out.println("year = "+year);
		d = d%365;
		month = d/30;
		System.out.println("Month = "+month);
		d=d%30;
		days = d;
		System.out.println("Days = "+days);
			
	}
}