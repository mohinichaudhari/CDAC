import java.util.Scanner;
class Ten{
		public static void main(String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the temprature in Fahrenheit :");
		float f = sc.nextFloat();
		float c;
		c = 5*(f-32)/9;
		System.out.println("Temprature in  Celsius = "+c);
		
	}
}