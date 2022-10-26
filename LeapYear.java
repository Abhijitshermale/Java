/*
class LeapYear
{
	public static void main(String a[])
	{
		int year = 2016;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{	
					System.out.println("Not Leap Year");	
				}
				else
				{
					System.out.println("Leap Year");
				}	
			}
			else
			{
				System.out.println("Leap Year");	
			}
		}
		else
		{
			System.out.println("Not Leap Year");
		}

	}
}
*/
class LeapYear
{
	public static void main(String a[])
	{
		int year=2016;
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("Leap Year");	
		}
		else
		{
			System.out.println("Not Leap Year");	
		}
	}	
}

