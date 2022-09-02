package PKG1;

public class Child2 extends Inheritance1
{
	public void aaa()
	{
		System.out.println("Child 2");
	}
	
	public static void main(String[] args)
	{
		Child2 z=new Child2();
		z.m0();
		z.aaa();
		z.a=123;
		System.out.println(z.a);
		
	}
}
