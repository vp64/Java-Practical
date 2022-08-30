package PKG1;

//Assignment2----(using this keyword)
//Output should be in the below sequence
//3rd method
//default method
//4th method
//1st method
//2nd method


public class P5thisK 
{
	public void m0()
	{
		this.m3();
		System.out.println("Default Method");
	}
	
	public void m1()
	{
		this.m4();
		System.out.println("1st Method");
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("2nd Method");
	}
	
	public void m3()
	{
		System.out.println("3rd Method");
	}
	
	public void m4()
	{
		this.m0();
		System.out.println("4th Method");
	}
	
  public static void main(String[] args) 
  {
	  P5thisK ob1=new P5thisK();
	  ob1.m2();
  }
	
}
