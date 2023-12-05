package Test1;

public class Thiscont {
	
	public Thiscont()
	{
		System.out.println("Default Cont");
	}
	
	public Thiscont(int a)
	{
		System.out.println("1 P CONT");
	}

	public Thiscont(int a, int b)
	{
		this(45,56,23,56);
		System.out.println("two P Cont");
	}
	
	public Thiscont(int a, int b, int c)
	{
		System.out.println("3 P Cont");
	}
	
	public Thiscont(int a, int b, int c, int d)
	{
		
		System.out.println("4 P Cont");
	}
	
	public static void main(String[] args) {
		
		
		Thiscont ob3=new Thiscont(45,23,56);
		Thiscont ob=new Thiscont();
		Thiscont ob4=new Thiscont(23);
		Thiscont ob1=new Thiscont(45,23);
		
		
	}

}
