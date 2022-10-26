import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The String : ");
		String str = sc.next();
		int len=str.length();
		String ans ="";
		for(int i=len-1 ;i>=0 ; i-- )
		{
			ans+=str.charAt(i);
		}
		System.out.println("The reverse String is : "+ans);
	}
}