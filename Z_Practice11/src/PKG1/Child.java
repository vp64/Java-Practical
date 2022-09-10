package PKG1;

public class Child extends Inheritance1
{
  public void m1()
  {
	  System.out.println("Child Class");
  }
     
  public static void main(String[] args) 
  {
	Child ob1=new Child();
	ob1.m0();
	ob1.m1();
	ob1.a=201;
	System.out.println(ob1.a);
  }
}
