package PKG2;

import java.util.Scanner;

public class ForLoopPRG1
{
	public static void main(String[] args) 
	{
	  System.out.println("Please enter number : ");
	  Scanner ob=new Scanner(System.in);
	  int n=ob.nextInt();
	  
	  for(int i=0;i<=n;i++)
	  {
		  System.out.println("Welcome "+i);
	  }
	}
}
