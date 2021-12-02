package pack;

public class Mthd_ovrlding_nonstatic {
	
	public void relationaloperators()
	{
		System.out.println("Less than");
	}
	
	public void relationaloperators(int a)
	{
		System.out.println("Greater than");
	}
	
	public void relationaloperators(char j)
	{
		System.out.println("Less than or Equal to");
	}
	
	public void relationaloperators(int e, char h)
	{
		System.out.println("Greater than or Equal to");
	}
	
	public void relationaloperators(char d,int s)
	{
		System.out.println("Equal to");
	}
	
	public void relationaloperators(float g)
	{
		System.out.println("Not equal to");
	}

	
	public static void main(String[] args) {
		
		Mthd_ovrlding_nonstatic x = new Mthd_ovrlding_nonstatic();
		
		x.relationaloperators();
		x.relationaloperators(4);
		x.relationaloperators('d');
		x.relationaloperators(2,'w');
		x.relationaloperators('m',7);
		x.relationaloperators(9.8f);
	}
}
