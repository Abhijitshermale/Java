class FM
{
	final void m1()
	{
		System.out.println("I am in first class");
	}
}
class FinalMethod extends FM
{
	void m1()//we can not override final method
	{
		System.out.println("I am in Second class");
	}
	public static void main(String[] args)
	{
		FinalMethod fm = new FinalMethod();
		fm.m1();
	}
}
