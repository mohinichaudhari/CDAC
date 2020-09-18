import java.util.Scanner;
class Nineteen{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter final value : ");
		int n = sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			
			ans= ans+i*i;
		}
		System.out.println("");
		System.out.println("Answer of series is : "+ans);

	}
}