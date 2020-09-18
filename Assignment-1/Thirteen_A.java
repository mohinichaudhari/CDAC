import java.util.Scanner;
class Thirteen_A{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a = "+a+" is greater number");
			}
			else
			{
				System.out.println("c = "+c+" is greater number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b = "+b+" is greater number");
			}
			else
			{
				System.out.println("c = "+c+" is greater number");
			}
		}
		
	}
}	