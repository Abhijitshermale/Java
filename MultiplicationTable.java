import java.util.*;

class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table Number");
		int number = sc.nextInt();
		for(int i=1; i<=10;i++)
		{
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}
}