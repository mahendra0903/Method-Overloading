package pack;

public class Mthd_ovrlding_static {

	public static void arithmeticoperations()
	{
		System.out.println("Addition");
	}
	
	public static void arithmeticoperations(int a)
	{
		System.out.println("Substraction");
	}
	
	public static void arithmetioperations(char m)
	{
		System.out.println("Multiplication");
	}
	
	public static void arithmeticoperations(int s,char f)
	{
		System.out.println("Division");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithmeticoperations();
		arithmeticoperations(4);
		arithmeticoperations('r');
		arithmeticoperations(6,'t');

	}

}
