package PKG1;

import java.util.Scanner;

public class ScannerClass1
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter number 1 : ");
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		System.out.println("1st Number is "+m);
		
		System.out.println("Please enter number 2 : ");
		float f=obj.nextFloat();
		System.out.println("2nd Number is "+f);
		
		
		
	}

}
