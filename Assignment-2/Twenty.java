import java.util.Scanner;
class Twenty{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First number");
		int first = sc.nextInt();
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		int temp;
		for(int i=first;i<=second;i++)
		{
			temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=1;
					break;
				}
			}
			if(temp==0)
			{
					System.out.print(i+" ");
					continue;
			}
		}
	
	}
}