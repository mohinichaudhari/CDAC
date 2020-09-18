import java.util.Scanner;
class Seven{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 5 subject :");
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int m4 = sc.nextInt();
	int m5 = sc.nextInt();
	int sum = m1+m2+m3+m4+m5;
	System.out.println("Addition = "+sum);
	float p = ((sum*100)/500);
	System.out.println("Percentage = "+p+" %");
	}
}