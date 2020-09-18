import java.util.Scanner;
class Six{
	public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		float pi = 3.14F;
		float area;
		float cm;
		System.out.println("Enter radius of Circle :");
		int r = sc.nextInt();
		area = pi*r*r;
		cm = 2*pi*r;
		System.out.println("Area of Circle = "+area);
		//System.out.printf("Area of Circle = %.3f",area);
		
		System.out.println("circumference  of Circle = "+cm);
	}
}