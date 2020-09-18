import java.util.Scanner;
class Q22{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 number :");
		int arr[]=new int[10];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}
		System.out.println("Descending order :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}