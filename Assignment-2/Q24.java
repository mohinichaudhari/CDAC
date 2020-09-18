import java.util.Scanner;
class Q24{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		int temp=0;
		System.out.print("Enter Size of array : ");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element of array");
		int arr [] =new int [size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number that you want to search : ");
		int n = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			temp=0;
			if(arr[i]==n)
			{
				temp=1;
				System.out.println("Element "+n+" Found");
				break;
			}
		}
		if(temp==0)
		{
			System.out.println("Element "+n+" Not Found");
		}
		
	}
}