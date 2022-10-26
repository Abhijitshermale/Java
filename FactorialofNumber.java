import java.util.*;

class FactorialofNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int factorial=1;
		for(int i=number;i>=1;i--)
		{
			factorial*=i;
		}
		System.out.println("Factorial of "+number+" is : "+factorial);
	}
}
