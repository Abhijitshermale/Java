import java.util.*;
class PrimeChecker
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int count=0;
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
				count+=1;
			}
		}
		if(count > 0 )
		{
			System.out.println("The "+number+" is not Prime");
		}
		else
		{
			System.out.println("The "+number+" is prime");
		}
	}
}