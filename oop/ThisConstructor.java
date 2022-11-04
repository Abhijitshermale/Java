class ThisConstructor
{
	ThisConstructor()
	{
		System.out.println("This is no parameter constructor");
	}
	ThisConstructor(int a)
	{
		this();
		System.out.println("This is parameterized constructor");
	}
	public static void main(String[] args)
	{
		ThisConstructor tc = new ThisConstructor(10);
	}
}
