package PKG1;

public class ParentCons 
{
  public ParentCons()
  {
	  System.out.println("Parent Default Constructor");
  }
  
  public ParentCons(int a)
  {
	  this(121,145);
	  System.out.println("Parent One parameterized Constructor");
  }
  
  public ParentCons(int a,int b)
  {
	  System.out.println("Parent Two parameterized Constructor");
  }
}
