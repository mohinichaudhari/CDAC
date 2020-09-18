import java.util.Scanner;
class Q21{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 number : ");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		float avg;
		for(int a : arr)
		{
			sum = sum+a;
		}
		System.out.println("Addition = "+sum);
		avg= sum/10F;
		System.out.println("Average = "+avg);
	}
}