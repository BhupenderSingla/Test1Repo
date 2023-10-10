package Test1;

public class student {
	
	int age;
	int rollno;
	
	
	public void dis1()
	{
		System.out.println("Welcome all of you");
	}
	public void dis2()
	{
		System.out.println("Autmation is very easy");
		
	}

	public static void main(String[] args) {
		student obj= new student();
		
		obj.dis1();
		obj.dis2();
		obj.age=23;
		System.out.println(obj.age);
		obj.rollno=14;
		System.out.println(obj.rollno);
		
		
	}
}
