class Student{
	private int rno;
	private String name;
	void setData(int roll_no,String stud_name)
	{
		rno=roll_no;
		name=stud_name;
	}	
	void showData() 
	{
		System.out.println("Roll No = "+rno+" Student Name = "+name);
	}
	
}

class StudentDemo{
		public static void main(String args[])
		{
			Student s = new Student();
			s.setData(1,"Mohini");
			s.showData();
		}
	
}