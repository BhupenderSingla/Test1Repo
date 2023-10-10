package Test1;

public class Test3 {

	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiply is = "+ c);
		return c;
		
	}
	public int div(int a1, int a2)
	{
		int a3;
		a3=a1/a2;
		System.out.println("divison is = "+ a3);
		return a3;
		
	}
	public int sum (int s1, int s2)
	{
		int s3;
		s3=s1+s2;
		System.out.println("sum is =" + s3);
		return s3;
		
	}
	public int sub (int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("subtration is = "+ z);
		return y;
		
	}
	public static void main(String[] args) {
		Test3 ob=new Test3();
		int mulr=ob.multi(80,40);
		int mulr2=ob.multi(mulr, 50);
		int divr=ob.div(mulr2, 60);
		int sumr=ob.sum(divr, 4);
		ob.sub(sumr, 8);
		
		
	}
}
