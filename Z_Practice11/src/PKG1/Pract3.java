package PKG1;

///Assignment2-----((((10/2)-2)-2)+2)*2)

public class Pract3 
{

	public int div(int a,int b)
	{
		int c= a/b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int sub1(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) 
	{
	
		Pract3 t=new Pract3();
		
		int r1=t.div(10, 2);
		int r2=t.sub(r1, 2);
		int r3=t.sub1(r2, 2);
		int r4=t.add(r3, 2);
		int r5=t.mul(r4, 2);
		
		System.out.println("((((10/2)-2)-2)+2)*2) = " +r5);
		
		
				
	}
}
