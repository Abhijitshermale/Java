class StaticBlock
{
	static
	{
		System.out.println("I am in first static block");
	}
	public static void main(String[] args)
	{
		System.out.println("I am in Main Method");
	}
	static
	{
		System.out.println("I am in second static block");
	}
}
