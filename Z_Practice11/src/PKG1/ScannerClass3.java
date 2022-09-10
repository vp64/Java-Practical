package PKG1;

import java.util.Scanner;

//Assignment2
//((((a1*a2)+a3)+a4)-a5)/a6)



public class ScannerClass3 
{
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}

	public int add1(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public int add2(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}

	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args)
	{
		
	 System.out.println("Please enter value : ");
	 Scanner ob=new Scanner(System.in);
	 int a1=ob.nextInt();
	 int a2=ob.nextInt();
	 int a3=ob.nextInt();
	 int a4=ob.nextInt();
	 int a5=ob.nextInt();
	 int a6=ob.nextInt();
	 
	 ScannerClass3 ob1=new ScannerClass3();
	 int r1=ob1.mul(a1,a2);
	 int r2=ob1.add1(r1,a3);
	 int r3=ob1.add2(r2, a4);
	 int r4=ob1.sub(r3,a5);
	 int r5=ob1.div(r4,a6);
	 
	 System.out.println(" ((((a1*a2)+a3)+a4)-a5)/a6) : "+r5);
	 
	}
}
