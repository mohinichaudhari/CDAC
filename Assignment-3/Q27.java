import java.util.*;
class Q27{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter size of array : ");
				int n = sc.nextInt();
				int a[]=new int[n];
				
				System.out.println("Enter "+n+" array element : ");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				/*Arrays.sort(a);*/
				
				int min=a[0];
				int max=a[0];
				for(int x : a)
				{
					if(x > min)
					{
						max=x;
					}
					else
					{
						min=x;
					}
				}
				System.out.println("Smallest Number is : "+min);
				System.out.println("largest Number is : "+max);
			}
		}