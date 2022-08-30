package PKG1;

//output should be in the below sequence(create one object
//and use this keyword)
//3 parameterized constructor
//default constructor
//1 parameterized constructor
//4 parameterized constructor
//2 parameterized constructor


public class P4Cons 
{
	public P4Cons() 
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	 
	public P4Cons(int a) 
	{
		this();
		System.out.println("1 parameterized Constructor");
	}
	
	public P4Cons(int a,int b) 
	{
		this(1,2,3,4);
		System.out.println("2 parameterized Constructor");
	}
	
	public P4Cons(int a,int b,int c) 
	{
		
		System.out.println("3 parameterized Constructor");
	}
	
	public P4Cons(int a,int b,int c,int d) 
	{
		this(1);
		System.out.println("4 parameterized Constructor");
	}

	public static void main(String[] args) 
	{
		P4Cons c=new P4Cons(2,5);
		
	}
}
