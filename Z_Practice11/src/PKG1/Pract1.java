package PKG1;

public class Pract1
{
	int age, rollno;
	public void display1()
	{		
		System.out.println("Welcome to Automation Testing.");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		Pract1 ab=new Pract1();
		
		ab.display1();
		ab.display2();
		
		System.out.println(ab.age=20);
		System.out.println(ab.rollno=21);
	}
}
