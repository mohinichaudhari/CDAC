
//59.Create a class Voter(voterId, name, age) with parameterized 
//constructor.  The parameterized constructor should throw a checked 
//exception if age is less than 18. 
//The message of exception is “invalid age for voter ”



class Voter{
		int voterId;
		String name;
		int age;
		public Voter(int voterId, String name, int age) {
			this.voterId = voterId;
			this.name = name;
			
			if(age <= 18)
			{
				try {
					throw new Exception("invalid age for voter");
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
			else
			{
				this.age = age;
				System.out.println("voterId = "+voterId+" name = "+name+" age = "+age);
			}
		}
		
	}
public class Q59 {

	
	public static void main(String[] args) {
		Voter v = new Voter(1,"Mohini",17);	

	}

}
