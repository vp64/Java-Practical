package PKG1;

public class ChildCons2 extends ParentCons2
{
	public void m()
	  {		
		  super.xyz=789;
		  System.out.println("Child Default method");
		  System.out.println(super.xyz);
	  }
	  
	  public void m(int a)
	  {   
		  super.m(1,2);
		  this.m();
		  this.m(1,2,3);
		  this.m(1,2);
		  System.out.println("Child one parameterized method");
	  }
	  
	  public void m(int a,int b)
	  {
		 
		  System.out.println("Child two parameterized method");
	  }
	  
	  public void m(int a,int b,int c)
	  {
		 
		  System.out.println("Child three parameterized method");
	  }
	  
	  public static void main(String[] args) 
	  {
		ChildCons2 t = new ChildCons2();
		t.m(1);
	  }
}
