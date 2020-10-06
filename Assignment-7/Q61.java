import java.util.Scanner;

//61.Create a Thread class to print following star (*) pattern on screen
//with delay of 1 second between each * print. Number of lines in the 
//pattern should be passed to the constructor of Thread class. 
//*  * * * *  * * * * * * * * * * Use this 
//class in main method and ask user to enter number of lines to print


class Mythread extends Thread{
	int num;

	public Mythread(int num) {
		super();
		this.num = num;
	}
	public void run() {
		for(int i=0;i<num;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print("* ");
		}
	}
}
public class Q61 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num : ");
	int num = sc.nextInt();
	Mythread m = new Mythread(num);
	m.start();
	
	}

}
