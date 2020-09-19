import java.util.*;
class Q29{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter size of rows : ");
				int rows = sc.nextInt();
				int arr[][]=new int [rows][];
				int cols;
				for(int i=0;i<arr.length;i++)
				{
					System.out.print("Enter size of row "+i+" : ");
					cols=sc.nextInt();
					arr[i]= new int[cols];
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.println("Enter the value for arr["+i+"]["+j+"] : ");
						arr[i][j]=sc.nextInt();
					}
				}
				
				
				for(int i=0;i<arr.length;i++)
				{
					int count=0;
					for(int j=0;j<arr[i].length;j++)
					{
						count++;
					}
					System.out.println("total no. of elements in "+i+" 1-D elements="+count);
				}
				System.out.println("Number of rows in 2-D array are : "+rows);
			}
		}