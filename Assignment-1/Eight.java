import java.util.Scanner;
class Eight{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principle,rate of interest and time :");
	int p = sc.nextInt();
	float r = sc.nextFloat();
	int t = sc.nextInt();
	
	float SI;
	SI=((p*r*t)/100);
	System.out.println("Simple Interest is = "+SI);
}
}