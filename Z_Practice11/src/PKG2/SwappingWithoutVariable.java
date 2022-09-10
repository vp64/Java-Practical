package PKG2;

//Swapping of two number without third variable

import java.util.Scanner;

public class SwappingWithoutVariable
{
	public static void main(String[] args) 
	{
		
	System.out.println("Please enter number A : ");
	Scanner ob=new Scanner(System.in);
	int A=ob.nextInt();
	
	System.out.println("Please enter number B : ");
	int B=ob.nextInt();
	
	System.out.println("Before Swapping A nd B value : "+A+" and "+B);
	A=A+B;
	B=A-B;
	A=A-B;
	
	System.out.println("After Swapping A nd B value : "+A+" and "+B);
	
	}
}
