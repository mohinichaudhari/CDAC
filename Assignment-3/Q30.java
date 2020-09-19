import java.util.*;
class Q30{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter size of rows : ");
				int rows = sc.nextInt();
				int arr[][]=new int [rows][];
				int cols;
				int sum=0;
				for(int i=0;i<arr.length;i++)
				{
					System.out.print("Enter size of row "+i+" : ");
					cols=sc.nextInt();
					arr[i]= new int[cols];
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.println("Enter the value for arr["+i+"]["+j+"] : ");
						arr[i][j]=sc.nextInt();
						if((i+j)%2==0 && i==j)
						{
							sum=sum+arr[i][j];
						}
					}
					
				}
				System.out.println("Addition of diagonal Element is : "+sum);
			}
		}