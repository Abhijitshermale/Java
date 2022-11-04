class Test
{
	void m1()
	{
		System.out.println("I am in first class.");
	}
}
class SuperMethod extends Test
{
	void m1()
	{
		System.out.println("I am in second class.");
	}
	void show()
	{
		super.m1();
		this.m1();
	}
	public static void main(String[] args)
	{
		SuperMethod sm = new SuperMethod();
		sm.show();
	}
}
