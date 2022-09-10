package PKG1;

public class Inheritance1 
{  
	int a;
	
	public void m0()
	{
		System.out.println("Parent Class");
	}
	
	public final void m21()
	{
		System.out.println("Final keyword test");
	}
	
	
	public static void main(String[] args)
	{
	    Inheritance1 ob=new Inheritance1();
	    ob.m0();
	}
}
