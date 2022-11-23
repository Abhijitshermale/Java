class CompiletimePoly{

	void show(int a)
	{
		System.out.println(a);

	}
	void show()
	{
		System.out.println("2");
	}
//
//
//
//
	void show(String a,int b)
	{
		System.out.println(a+" "+b);
	}
	void show(int a,String b )
	{
		System.out.println(a+" "+b);
	}
//
//
//
//
	void show(String a)
	{
		System.out.println(a);
	}
	void show(int a,int b)
	{
		System.out.println(a+" "+b);
	}


	public static void main(String[] args)
	{
		CompiletimePoly ob = new CompiletimePoly();
		ob.show(1);
		ob.show();
		System.out.println(" ");
		ob.show("Abhi",1);
		ob.show(1,"Abhi");
		System.out.println(" ");
		ob.show("Abhi");
		ob.show(1,1);

	}

}
