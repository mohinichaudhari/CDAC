import java.util.*;
class Q28{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				
				String arr[]=new String[5];
				System.out.println("Enter array Strings : ");
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextLine();
				}
				System.out.println("Array strings are : ");
				for(String x : arr)
				{
					System.out.println(x);
				}
			}
		}