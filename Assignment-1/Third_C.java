class Third_C{
	public static void main(String args []){
		int x=1;
		int y=1;
		int z;
		z = x++ - --y - --x  +  x++;
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	}
}