class Student{
	private int rno;
	private String name;
	public static int count;
	void setData(int roll_no,String stud_name)
	{
		rno=roll_no;
		name=stud_name;
		count++;
	}	
	void showData() 
	{
		System.out.println("Roll No = "+rno+" Student Name = "+name);
		System.out.println("object created ="+Student.count);
	}
	
}

class StudentDemo{
		public static void main(String args[])
		{
			Student s = new Student();
			s.setData(1,"Mohini");
			s.showData();
			s.setData(2,"Ashwini");
			s.showData();
			s.setData(3,"Anuja");
			s.showData();
		}
	
}