package PKG1;

public class ImplicitExplicit 
{
  public void m()
  {
	  int a=5;
	  float b;
	  b=a;   // Implicit Data type Conversion
	  System.err.println("Implicit Data Type Conversion Result");
	  System.err.println(b);
  }
  
  public void m1()
  {
	  float a=5.25F;
	  int b;
	  b=(int)a;   // Explicit Data type Conversion
	  System.err.println("Explicit Data Type Conversion Result");
	  System.err.println(b);
  }
  
  
  
  public static void main(String[] args) 
  {
	ImplicitExplicit ob=new ImplicitExplicit();
	ob.m();
	ob.m1();
	
  }
	
}
