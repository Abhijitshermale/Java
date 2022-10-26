import java.util.*;

class AmstrongNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t1=num;
		int len=0;
		while(t1 != 0 )
		{
			t1/=10;
			len++;	
		}
		int t2=num;
		int rem;
		int ams=0;
		while(t2 !=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=len;i++)
			{
				mul*=rem;
			}
			ams+=mul;
			t2/=10;
		}
		if(num == ams)
		{
			System.out.println("It's Amstrong Number");
		}
		else
		{
			System.out.println("Not Amstrong Number");
		}	
	}
}