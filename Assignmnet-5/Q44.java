//	44.	Create three classes
//	-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId 
//		as input and another printSalary() to print salary.
//	-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() 
//		method in this class that calls super class inut() method and accepts basicSalary and allowance as input. 
//		Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
//	-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() 
//		method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. 
//		Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

/*class Faculty{
	private int facultyId;
	private int salary;

	void input(int facultyId)
	{
		this.facultyId=facultyId;
		
	}
	void printSalary()
	{
		System.out.println("Faculty id = "+facultyId);
	}
}
*/

class Q44{
	public static void main(String args[])
	{
		System.out.println("Hello");
	}
}
