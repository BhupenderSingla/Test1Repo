package Test1;

public class Thismethod {

	public void m1()
	{
		this.m3();
		System.out.println("M1 method");
		this.m4();
		this.m2();
	}
	public void m2()
	{
		System.out.println("M2 Method");
	}
	public void m3()
	{
		System.out.println("M3 method");
	}
	public void m4()
	{
		System.out.println("M4 method");
	}
	public static void main(String[] args) {
		
		Thismethod ob=new Thismethod();
		ob.m1();
		
		
	}
	
}
