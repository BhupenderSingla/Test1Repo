package Test1;

public class Cont {
	public Cont()
	{
		System.out.println("Default Contrustor");
	}

	public Cont(int a, int b)
	{
		System.out.println("Two parametrized contuctor");
	}
	public Cont(int a, int a2, int a3)
	{
		System.out.println("three parametrized contuctor");
	}
	public static void main(String[] args) {
		//Cont ob=new Cont(44,56,55);
		Cont ob2=new Cont(56,85);
		Cont ob3=new Cont();
		
		
	}
}

