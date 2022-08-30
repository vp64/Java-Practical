package PKG1;

//Assignment2----(using this keyword)
//Output should be in the below sequence
//three parameterized method
//default method
//four parameterized method
//one parameterized method
//two parameterized method

public class P5thisK2 
{

	public void m()
	{
		this.m(1,2,3);
		System.out.println("Default Method");
	}
	
	public void m(int a)
	{
		this.m(1,2,3,4);
		System.out.println("One Parameterized Method");
	}
	
	public void m(int a,int b)
	{
		this.m(1);
		System.out.println("Two Parameterized Method");
	}
	
	public void m(int a,int b,int c)
	{
		System.out.println("Three Parameterized Method");
	}
	
	public void m(int a,int b,int c,int d)
	{
		this.m();
		System.out.println("Four Parameterized Method");
	}
	
  public static void main(String[] args) 
  {
	  P5thisK2 ob1=new P5thisK2();
	  ob1.m(1,2);
  }

}
