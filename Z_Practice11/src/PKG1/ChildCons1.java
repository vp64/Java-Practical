package PKG1;

//Assignment 1
//Parent three parameterized constructor
//Parent default constructor
//Parent one parameterized constructor
//Parent two parameterized constructor
//Child two parameterized constructor
//Child default constructor
//Child one parameterized constructor
//Child three parametrized constructor


public class ChildCons1 extends ParentCons1
{
	public ChildCons1()
	  {
		  this(1,2);
		  System.out.println("Child Default Constructor");
	  }
	  
	  public ChildCons1(int a)
	  {
		  this();
		  System.out.println("Child One parameterized Constructor");
	  }
	  
	  public ChildCons1(int a,int b)
	  {
		  super(1,2);
		  System.out.println("Child Two parameterized Constructor");
	  }
	  
	  public ChildCons1(int a,int b,int c)
	  {
		  this(1);
		  System.out.println("Child Three parameterized Constructor");
	  }
	  
	  public static void main(String[] args) 
	  {
		ChildCons1 t=new ChildCons1(1,2,3);
	  }

}
