package PKG2;

import java.util.Scanner;

public class IfCondPRG2 
{
	
 public static void main(String[] args)
 {
	System.out.println("Please enter number");
	Scanner ob=new Scanner(System.in);
	int marks=ob.nextInt();
	
	if(marks>=0 && marks<35)
	{
		System.out.println("------Fail---------");
	}
	else if(marks>=35 && marks<60)
	{
		System.out.println("-------Pass Class------");
	}
	else if(marks>=60 && marks<70)
	{
		System.err.println("------First Class-----");
	}
	else if(marks>=70 && marks<=100)
	{
		System.out.println("------Distinction-------");
	}
	else
	{
		System.out.println("Invalid Value....Please enter a valid number");
	}
 }	

}
