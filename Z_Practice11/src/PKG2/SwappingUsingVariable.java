package PKG2;

// Swapping of two number using third variable
import java.util.Scanner;

public class SwappingUsingVariable 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter number A : ");
		Scanner ob=new Scanner(System.in);
		int A=ob.nextInt();
		
		System.out.println("Please enter number B : ");
		int B=ob.nextInt();
		
		int X;
		X=A;
		A=B;
		B=X;
		
		System.out.println(" After swapping Value of A : "+A);
		System.out.println(" After swapping Value of B : "+B);
		
	}
	
}
