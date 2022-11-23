import java.util.*;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
class ThrowKeyword
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = sc .nextInt();
		try
		{
		if(age<=17)
		{
			throw new   YoungerAgeException("You are not eligible to vote");
		}
		else
		{
			System.out.println("Vote Succesfull");
		}
		}
		catch(YoungerAgeException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am finally block");
		}
		System.out.println("Exicution Done");
	}
}
