import java.util.Scanner;
class Q23{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		System.out.println("Enter "+size+" array element : ");
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse of array is : ");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		
	}
}