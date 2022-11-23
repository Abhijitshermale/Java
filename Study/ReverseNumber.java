import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int rem,rev=0;
		int number = sc.nextInt();
		while(number != 0 )
		{
			rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}	
		System.out.println("The Reverse number is "+rev);
	}
}