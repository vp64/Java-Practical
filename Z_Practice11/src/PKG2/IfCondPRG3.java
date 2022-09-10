package PKG2;

import java.util.Scanner;

public class IfCondPRG3 
{
	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("Odd Number");
			}
		}
		else
		{
			System.out.println("Invalid number.....Please enter positive number");
		}
	}
}

