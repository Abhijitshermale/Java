import java.util.*;

class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The String : ");
		String check = sc.next();
		String str = check;
		int len=str.length();
		String ans ="";
		for(int i=len-1 ;i>=0 ; i-- )
		{
			ans+=str.charAt(i);
		}

		System.out.println(check);
		System.out.println(ans);
		if(ans.equals(check))
		{
			System.out.println("It's Palindrome");

		}
		else
		{
			System.out.println("It's Not Palindrome");
		}
	}
}