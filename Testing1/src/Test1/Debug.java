package Test1;
//for debug
public class Debug {

	public void m1()
	{
		System.out.println("Method M1");
	}
	public void m2()
	{
		System.out.println("Method M2");
	}
	public static void main(String[] args) {
		
		Debug ob=new Debug();
		System.out.println("Main method line 1");
		ob.m1();
		System.out.println("Main Method line 2");
		ob.m2();
		System.out.println("Main Method line 3");
		
		multi ob9=new multi();//has a relation
		ob9.summ(45,56);
		
	}
}
