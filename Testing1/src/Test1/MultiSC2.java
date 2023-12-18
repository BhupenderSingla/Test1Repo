package Test1;

import java.util.Scanner;

//(((((x1*x2)-x3)+x4)-x5)/x6)
public class MultiSC2 {

	public int add(int a1, int a2)
	{
		int a3=a1+a2;
		return a3;
	}
	public int sub(int s1, int s2)
	{
		int s3=s1-s2;
		return s3;
		
	}
	public int mul(int m1, int m2)
	{
		int m3=m1*m2;
		return m3;
	}
	public int div(int d1, int d2)
	{
		int d3=d1/d2;
		return d3;
	}
	
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		MultiSC2 obj=new MultiSC2();
		System.out.println("enter value of a");
		int a=ob.nextInt();
		System.out.println("enter value of b");
		int b=ob.nextInt();
		System.out.println("enter value of c");
		int c=ob.nextInt();
		System.out.println("enter value of d");
		int d=ob.nextInt();
		System.out.println("enter value of e");
		int e=ob.nextInt();
		System.out.println("enter value of f");
		int f=ob.nextInt();
		int milr= obj.mul(a, b);
		System.out.println("Multiply is " +milr);
		int subr= obj.sub(milr, c);
		System.out.println("Subtraction is "+subr);
		int addr=obj.add(subr, d);
		System.out.println("addtion is "+addr);
		int subr2=obj.sub(addr, e);
		System.out.println("Subration is "+subr2);
		int divr=obj.div(subr2, f);
		System.out.println("final result is "+divr);
		
	}
}
