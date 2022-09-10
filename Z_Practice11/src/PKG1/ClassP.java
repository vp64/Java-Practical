package PKG1;

public class ClassP 
{
	static int a=12;
	
	public void increment1()
	{
		a=a+1;
	}
	
	public static void main(String[] args) 
	{
		ClassP ob1=new ClassP();
		
		System.out.println(" Before calling method, Value of a : "+ob1.a);
		ob1.increment1();
		System.out.println(" Object 1 : After increment method calling Value of a : "+ob1.a);
		
		ClassP ob2=new ClassP();
		ob2.increment1();
		System.out.println(" Object 2 : After increment method calling Value of a : "+ob2.a);
		
		ClassP ob3=new ClassP();
		ob3.increment1();
		System.out.println(" Object 3 : After increment method calling Value of a : "+ob3.a);
		
		
	}
	
	
	

}
