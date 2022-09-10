package PKG2;

import java.util.Scanner;

public class IfCondPRG1
{
	public static void main(String[] args) 
	{
	   System.out.println("Enter Number : ");
	   Scanner ob=new Scanner(System.in);
	   int a=ob.nextInt();
	   
	   if(a%2==0)
	   {
		   System.out.println("------Even number-------");
	   }
	   else 
	   {
		   System.out.println("Invalid Number.....Please enter number again");
	   }
	}
}
