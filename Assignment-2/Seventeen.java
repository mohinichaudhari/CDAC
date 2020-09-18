import java.util.Scanner;
class Seventeen{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int b=n;
		int reverse=0,remainder;
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n = n/10;
		}
		System.out.println("reverse of "+b+" is = "+reverse);
	}
}	