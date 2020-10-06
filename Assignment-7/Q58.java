import java.util.Scanner;

//58.Store name of weekdays in an array (starting from “Sunday” at 0 index).
//Ask day position from user and print day name. Handle array index out 
//of bound exception and give proper message if user enter day index 
//outside range (0-6).

public class Q58 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Firday","Saturday"};
	System.out.println("Enter day position: ");
	int day = sc.nextInt();	
	try {
		System.out.println("The day is : "+str[day]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please.....enter Valid Value");
	}
	}
}