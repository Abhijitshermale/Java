import java.util.*;
class FactorialRecursion
{
	static int fact=1;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number= sc.nextInt();
		FactorialRecursion ob = new FactorialRecursion();
		ob.calculateFactorial(number);
		System.out.println("Factorial of "+number+" is "+fact);
		
	}
	void calculateFactorial(int no)
	{
		if(no>=1)
		{	
			fact*=no;
			calculateFactorial(no-1);
		}	
	}
}