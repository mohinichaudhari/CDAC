import java.util.Scanner;
class Eighteen{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp =0;
		if(n == 0 || n == 1)
		{
			System.out.println("Wrong input");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					temp=1;
					System.out.println(n+" Not a prime number");
					break;
				}
			}
		}
		if(temp==0)
		{
			System.out.println(n+" is prime number");
		}
	}
}