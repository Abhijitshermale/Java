class Test
{
	Test()
	{
		System.out.println("I am in First Class");

	}
}
class SuperConstructor extends Test
{
	SuperConstructor()
	{
		//super();
		System.out.println("I am in Second class");
	}
	public static void main(String[] args)
	{
		SuperConstructor sc = new SuperConstructor();
	}
}
