import java.util.*;

class CheckPalindromeNumber
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number=sc.nextInt();
		int no=number;
		int rem,rev=0;
		while(no != 0 )
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		if(rev == number)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The Number is NOT palindrome");
		}		
	}	
}