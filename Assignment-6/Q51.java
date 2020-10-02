import java.util.Scanner;

//51.Create a program that helps banks to maintain records. It should have following facilities.
//o Anybody can create current or saving account with following initial information: 
//account number, name, balance, and branch. o display account detail for a particular accounts. 
//o display total money deposited in bank. o allow deposit and  withdrawal in an account.
//o for saving account opening balance and minimum balance must be 5000. o for current account 
//opening balance and minimum balance must be 1000. o can not
//withdraw the amount from the account that makes balance less than the minimum balance. 

class Account{
	static int totalDeposit=0;
	//int minbal=500;
	int AccNo;
	String AccName;
	int bal;
	String branch;
	
	public Account(int accNo, String accName, int bal, String branch) {
		super();
		AccNo = accNo;
		AccName = accName;
		this.bal = bal;
		this.branch = branch;
		//totalDeposit=totalDeposit+bal;
	}
	void display()
	{
		System.out.println("Account number : "+AccNo);
		System.out.println("Account number : "+AccName);
		System.out.println("Account number : "+bal);
		System.out.println("Account number : "+branch);
		//System.out.println("Account number : "+totalDeposit);
		
	}
	
	
}

class Current extends Account{

	public Current(int accNo, String accName, int bal, String branch) {
		super(accNo, accName, 1000, branch);
		
	}
	void display() {
		super.display();
		System.out.println("Current Account details are : ");
	}
	void deposit(int money)
	{
		bal=bal+money;
	}
	void withdrawal(int money)
	{
		if((bal-money)>1000)
		{
			bal=bal-money;
		}
		else
		{
			System.out.println("Low balance!!! Can't withdrawal money from this accound ");
		}
		
	}
	
}
class Saving extends Account{

	public Saving(int accNo, String accName, int bal, String branch) {
		super(accNo, accName, 5000, branch);
		
	}
	void display()
	{
		super.display();
		System.out.println("Saving Account details are : ");
	}
	void deposit(int money)
	{
		bal=bal+money;
	}
	void withdrawal(int money)
	{
		if((bal-money)>5000)
		{
			bal=bal-money;
		}
		else
		{
			System.out.println("Low balance!!! Can't withdrawal money from this accound ");
		}
	}
	
}

public class Q51 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("");
		//Account c1 = new Current();
		//Account s1 = new Saving();
	}

}
