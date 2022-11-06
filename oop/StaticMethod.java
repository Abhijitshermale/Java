class SM
{
	static void show()
	{
		System.out.println("i am in SM");
	}
}
class StaticMethod
{
	void display()
	{
		System.out.println("I am in StaticMethod ");
	}
	public static void main(String[] args)
	{
		StaticMethod sm = new StaticMethod();
		sm.display();
		SM.show();
	}
}
