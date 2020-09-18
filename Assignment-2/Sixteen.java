import java.util.Scanner;
class Sixteen{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int result;
		System.out.println("Table of "+n+" is : ");
		for(int i = 1;i<=10;i++)
		{
			result = n * i;
			System.out.println(" "+n+" * "+i+" = "+result);
		}
	}
}