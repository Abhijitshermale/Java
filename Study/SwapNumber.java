class SwapNumber
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a);
		System.out.println("b is "+b);

		int c=30,d=40;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("c is "+c);
		System.out.println("d is "+d);

		int e=50,f=60;
		e=e^f;
		f=e^f;
		e=e^f;
		System.out.println("e is "+e);
		System.out.println("f is "+f);

	}		
}