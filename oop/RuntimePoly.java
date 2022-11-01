class RuntimePoly
{
	void show(String a, int b)
	{
		System.out.println(b+" "+a);
	}
}
class B extends RuntimePoly
{
	void show(String a,int b)
	{
		super.show(a,b);
		System.out.println(a+" "+b);
	}
	public static void main(String[] atrgs)
	{
		B b=new B();
		b.show("Abhi",777);

		RuntimePoly rp=new RuntimePoly();
		rp.show("Champ",999);
	}
}

