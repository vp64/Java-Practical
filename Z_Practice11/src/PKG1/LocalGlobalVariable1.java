package PKG1;

public class LocalGlobalVariable1 
{
	int x; //Global Variable
	  
	  public void m1(int x)
	  {
		  this.x=x;
	  }
	  
	  public static void main(String[] args)
	  {
		LocalGlobalVariable1 ob=new LocalGlobalVariable1();
		ob.m1(456);
		System.err.println(ob.x);
	  }
	
}
