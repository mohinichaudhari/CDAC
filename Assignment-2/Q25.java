import java.util.Scanner;
class Q25{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element of array");
		int arr [] =new int [size];
		int eventotal=0;
		int oddtotal=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				eventotal=eventotal+arr[i];
			}
			else
			{
				oddtotal=oddtotal+arr[i];
			}
		}
		System.out.println("Sum of even number is : "+eventotal);
		System.out.println("Sum of odd number is : "+oddtotal);
	}
}