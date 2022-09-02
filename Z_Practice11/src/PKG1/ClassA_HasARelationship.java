package PKG1;

public class ClassA_HasARelationship
{
   public void m1()
   {
	   System.out.println("Method 1");
   }
   public void m2()
   {
	   System.out.println("Method 2");
   }
   public void m3()
   {
	   System.out.println("Method 3");
   }
   
   public static void main(String[] args)
   {
	ClassA_HasARelationship x=new ClassA_HasARelationship();
	x.m1();
	x.m2();
	x.m3();
   }
}
