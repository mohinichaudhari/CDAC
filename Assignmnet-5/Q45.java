//45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. 
//Create method show() to display information. Create another class CollegeStudent inherits Student class. 
//Add a new member semester to it. Create default and parameterized constructors. Also override show() method that
//calls super class show() method and displays semester. Create another class SchoolStudent inherits Student class.
//Add a new member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. 
//Also override show() method that calls super class show() method and displays className. Create a class( sayDemo) 
//with main method that carries out the operation of the project : -- has array to store objects of any
//class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store
//them inside the array -- display all records from the array -- search record on the basic of rollno and check given 
//rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75.
import java.util.Scanner;
class Student{
	private int rollno;
	private float percentage;
	
	Student()
	{
		rollno=1;
		percentage=56.45F;
	}
	Student(int rollno,float percentage)
	{
		this.rollno=rollno;
		this.percentage=percentage;
	}
	
	void show()
	{
		System.out.println("Rollno is = "+rollno+" Percentage = "+percentage);
	}
	int getRollno()
	{
		return rollno;
	}
	float getPercentage()
	{
		return percentage;
	}
}
class CollegeStudent extends Student {
	private int semister;
	
	CollegeStudent()
	{
		semister = 1;
	}
	
	CollegeStudent(int rollno,float percentage,int semister)
	{
		super(rollno,percentage);
		this.semister=semister;
	}
	
	void show()
	{
		super.show();
		System.out.println("Semister  = "+semister);
	}
	
}
class SchoolStudent extends Student{
	private String className;
	
	SchoolStudent()
	{
		className="12th";
	}
	SchoolStudent(int rollno,float percentage,String className)
	{
		super(rollno,percentage);
		this.className=className;
	}
	void show()
	{
		super.show();
		System.out.println("className  = "+className);
	}
}

class sayDemo{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[3];
		int rollno;
		float percentage;
		int semister;
		String className;
		int search;
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(i==0 || i==1 )
			{
				System.out.println("Enetr Details For collage Student : ");
				System.out.print("Enter Roll no : ");
				rollno=sc.nextInt();
				System.out.print("Enter percentage : ");
				percentage=sc.nextFloat();
				System.out.print("Enter semister : ");
				semister=sc.nextInt();
				s[i]=new CollegeStudent(rollno,percentage,semister);
			}
			else
			{
				System.out.println("Enetr Details For school Student : ");
				System.out.print("Enter Roll no : ");
				rollno=sc.nextInt();
				System.out.print("Enter percentage : ");
				percentage=sc.nextFloat();
				System.out.print("Enter class name : ");
				className=sc.next();
				s[i]=new SchoolStudent(rollno,percentage,className);
			}
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].show();
		}
		
		System.out.println("Enter roll no of student that you want to search : ");
		search =  sc.nextInt();
		for(int i=0;i<s.length;i++)
		{
			if(s[i] instanceof CollegeStudent ){
				if(search == s[i].getRollno())
				{
					System.out.println(search+" is of collage student");
				}
			}
			else
			{
				if(search == s[i].getRollno())
				{
					System.out.println(search+" is of School student");
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getPercentage() > 75)
			{
				count++;
			}
		}
		System.out.println(count+" students have 'A' grade");
	}
		
		
}

