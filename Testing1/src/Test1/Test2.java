package Test1;

public class Test2 {
	
	public int div1(int a, int b)
	{
		int div1r;
		div1r=a/b;
		System.out.println("Division result is = "+ div1r);	
		return div1r;
	
	}
	
	public int multiply(int c, int d)
	{
		int mulr;
		mulr=c*d;
		System.out.println("Multiply result is = "+ mulr);
		return mulr;
		
	}
	
	public int sum (int a1, int a2)
	{
		int sumr;
		sumr=a1+a2;
		System.out.println("sum result is = "+ sumr);
		return sumr;
		
		
	}
	public int sub ( int b1, int b2)
	{
		int subr;
		subr=b1-b2;
		System.out.println("subtration result is = "+ subr);
		return subr;
		
	}

	public static void main(String[] args) {
		Test2 obj=new Test2();
		int divr=obj.div1(10, 2);
		int divr2= obj.div1(divr, 5);
		int multiplyr= obj.multiply(divr2, 6);
		int multiplyr2= obj.multiply(multiplyr, 9);
		int divr3=obj.div1(multiplyr2, 2);
		int sumr= obj.sum(divr3, 8);
		int subr= obj.sub(sumr, 4);
		obj.multiply(subr, 5);
						
		
	}
}
