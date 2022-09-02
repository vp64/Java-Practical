package PKG1;

public class GrandChild extends Child
{
  public void m11()
  {
	  System.out.println("Grand Child");
  }
  
  public static void main(String[] args) 
  {
	GrandChild c1=new GrandChild();
	
	c1.m0();
	c1.m1();
	c1.m11();
	c1.a=456;
	System.out.println(c1.a);
  }
  
}
