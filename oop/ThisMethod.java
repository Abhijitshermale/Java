class ThisMethod
{
	void display()
	{
		System.out.println("Hello");
	}
	void show()
	{
		this.display();
	}
	public static void main(String[] args)
	{
		ThisMethod tm = new ThisMethod();
		tm.show();
	}
}

