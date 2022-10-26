import java.util.*;
class Calculator
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		String operator = sc.next();
		int res;
		switch(operator)
		{
			case "+": res=no1+no2;
					System.out.println(res);
					break;
			case "-": res=no1-no2;
					System.out.println(res);
					break;
			case "*": res=no1*no2;
					System.out.println(res);
					break;
			case "/": res=no1/no2;
					System.out.println(res);
					break;
			default: System.out.println("Invalid Input");
					break;
		}	
	}
}