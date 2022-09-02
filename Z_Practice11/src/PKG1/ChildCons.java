package PKG1;

public class ChildCons extends ParentCons
{
	public ChildCons()
	  {
		  System.out.println("Child Default Constructor");
	  }
	  
	  public ChildCons(int a)
	  {
		  System.out.println("Child One parameterized Constructor");
	  }
	  
	  public ChildCons(int a,int b)
	  {
		  super(4);
		  System.out.println("Child Two parameterized Constructor");
	  }
	  
	  public static void main(String[] args) 
	  {
		ChildCons t=new ChildCons(5,8);
	  }
}
