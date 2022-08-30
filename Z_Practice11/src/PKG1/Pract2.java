package PKG1;

//////// Assignment1----  ((((10+2)+2)-2)*2)/2)

public class Pract2 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;		
	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int c,int d)
	{
		int e=c-d;
		return e;
	}
	
	public int mul(int x,int y)
	{
		int z=x*y;
		return z;
	}
	
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	
	public static void main(String[] args) 
	{
		Pract2 ob=new Pract2();
		
		int r1 = ob.sum(10,2);
		int r2 = ob.add(r1,2);
		int r3 = ob.sub(r2,2);
		int r4 = ob.mul(r3,2);
		int r5 = ob.div(r4,2);
		
		
		System.out.println("ob.sum(10, 2) = " +r1 );
		System.out.println("add method = " +r2);
		System.out.println("sub method = "+r3);
		System.out.println("mul method = "+r4);
		System.out.println("((((10+2)+2)-2)*2)/2) = "+r5);
		
		
	}
	
	
}
