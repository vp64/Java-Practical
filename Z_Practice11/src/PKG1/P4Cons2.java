package PKG1;

//output should be in the below sequence(using this keyword)
//default method
//4 parameterized method
//1 parameterized method
//3 parameterized method
//2 parameterized method


public class P4Cons2
{
	
 public P4Cons2()
 {
	 System.out.println("Default Constructor");
 }
 
 public P4Cons2(int a)
 {
	 this(1,2,3,4);
	 System.out.println("1 Parameterized Constructor");
	 
 }

 public P4Cons2(int a,int b)
 {
	 this(1,2,3);
	 System.out.println("2 Parameterized Constructor");
 }

 public P4Cons2(int a,int b,int c)
 {
	 this(1);
	 System.out.println("3 Parameterized Constructor");
 }

 public P4Cons2(int a,int b,int c,int d)
 {
	 this();
	 System.out.println("4 Parameterized Constructor");
 }

  
 public static void main(String[] args) 
 {
	P4Cons2 ob=new P4Cons2(1,2);
	
 }
 
}
