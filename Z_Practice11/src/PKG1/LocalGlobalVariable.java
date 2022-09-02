package PKG1;

public class LocalGlobalVariable 
{
  int x; //Global Variable
  
  public void m1(int a)
  {
	  x=a;
  }
  
  public static void main(String[] args)
  {
	LocalGlobalVariable ob=new LocalGlobalVariable();
	ob.m1(456);
	System.err.println(ob.x);
  }
  
}
