package PKG1;

public class ParentCons2 
{
	int xyz;
	
	public void m0()
	  {
		  this.m3(1,2,3);
		  System.out.println("Parent Default method");
	  }
	  
	  public void m1(int a)
	  {		  
		  this.m0();
		  System.out.println("Parent one parameterized method");
	  }
	  
	  public void m(int a,int b)
	  {
		  this.m1(1);
		  System.out.println("Parent two parameterized method");
	  }
	  
	  public void m3(int a,int b,int c)
	  {
		  System.out.println("Parent three parameterized method");
	  }
	  
}
