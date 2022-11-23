class Test
{
	int i=10;

}
class SuperKeyword extends Test
{
	int i=20;
	void show(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args)
	{
		SuperKeyword sk = new SuperKeyword();
		sk.show(30);
	}
}

