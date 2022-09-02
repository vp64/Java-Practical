package PKG1;

public class OPPS1 
{
	public void arithmetic(int a,int b)
	{
		int c=a+b;
		System.err.println(c);
	}

	public float arithmetic(float a,int b)
	{
		float c=a+b;
		System.err.println(c);
		return c;
	}
	
	public static void main(String[] args) 
	{
		OPPS1 ob1=new OPPS1();
		ob1.arithmetic(5, 3);
		ob1.arithmetic(12.05F, 3);
	}
}
