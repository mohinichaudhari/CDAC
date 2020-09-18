import java.util.Scanner;
class Twelve{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Basic salary of employee :");
		long basic =  sc.nextLong();
		float hra=0,da=0,gs;
		if(basic < 10000)
		{
			hra = 0.10f*basic;
			da = 0.90f*basic;
		}
		else if(basic>=10000)
		{
			hra = 2000;
			da = 0.98f*basic;
		}
		gs = basic + hra + da;
		System.out.println("Gross Salary = "+gs);
	}
}