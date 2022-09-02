package PKG1;

public class ParentCons1
{
	public ParentCons1()
	  {
		  this(1,2,3);
		  System.out.println("Parent Default Constructor");
	  }
	  
	  public ParentCons1(int a)
	  {
		  this();
		  System.out.println("Parent One parameterized Constructor");
	  }
	  
	  public ParentCons1(int a,int b)
	  {
		  this(1);
		  System.out.println("Parent Two parameterized Constructor");
	  }
	  
	  public ParentCons1(int a,int b,int c)
	  {
		  System.out.println("Parent Three parameterized Constructor");
	  }
}
