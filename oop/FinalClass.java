final class FC
{
	void m1()
	{
		System.out.println("Hi there ");
	}
}
class FinalClass extends FC//we can not inherit the final class
{
	void m1()
	{
		System.out.println("Hi i am abhi");
	}
	public static void main(String[] args)
	{
		FinalClass fc = new FinalClass();
		fc.m1();
	}
}
