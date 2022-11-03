class First
{
	private int num;
	public void setemp(int n)
	{
		num=n;
	}
	public int getemp()
	{
		return num;
	}
}
class Encapsulation
{
	public static void main(String[] args)
	{
		First f =new First();
		f.setemp(1011);
		System.out.println(f.getemp());
	}
}
