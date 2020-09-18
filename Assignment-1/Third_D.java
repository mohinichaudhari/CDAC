class Third_D{
	public static void main(String args []){
		boolean x = false;
		boolean y = false;
		boolean z;
		z = x && y || !(x || y);
		System.out.println("z = "+z);
	}
}