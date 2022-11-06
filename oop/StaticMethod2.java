//we can not acces the non static variable and method in static method
class StaticMethod2
{
	
	void show1()
	{
		System.out.println("I am in first method");
	}
	static void show2()
	{
	
		System.out.println("I am in second method");
	}
	static void show3()
	{
		//show1();  //we caan not do this because it's non static method 
		show2();
	}
	public static void main(String[] args)
	{
		StaticMethod2.show3();
	}
}
