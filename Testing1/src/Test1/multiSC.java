package Test1;
//for result of (((((a+b)+c)-d)*e)/f)//
import java.util.Scanner;

public class multiSC {
	
	public int sum(int s1, int s2)
	{
		int sr=s1+s2;
		return sr;
		
	}
	public int sub(int su1, int su2)
	{
		int sur=su1-su2;
		return sur;
	}
	public int div(int d1, int d2)
	{
		int dr=d1/d2;
		return dr;
		
	}
	public int mul(int m1, int m2)
	{
		int mr=m1*m2;
		return mr;
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		multiSC ob=new multiSC();
		System.out.println("Please enter of a");
		int a= obj.nextInt();
		System.out.println("Please enter of b");
		int b= obj.nextInt();
		System.out.println("Please enter of c");
		int c=obj.nextInt();
		System.out.println("Please enter of d");
		int d=obj.nextInt();
		System.out.println("Please enter of e");
		int e=obj.nextInt();
		System.out.println("Please enter of f");
		int f=obj.nextInt();
		int sumr=ob.sum(a, b);
		int sumr2=ob.sum(sumr, c);
		int subr=ob.sub(sumr2, d);
		int mulr=ob.mul(subr, e);
		int divr=ob.div(mulr, f);
		System.out.println("Final result is="+divr);
		
	}
}
