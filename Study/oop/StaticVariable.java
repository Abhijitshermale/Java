class StaticVariable
{
	static int a=10;
	int c=30;
	void m1()
	{
		//static int b=20;  //we can not create local variable as a static
		int b=10;
	}
	
}
class Demo 
{
	public static void main(String[] args)
	{
		System.out.println(StaticVariable.a);
		//stem.out.println(StaticVariable.c); // we can not use c using class name because its not a Static variable
	}
}
