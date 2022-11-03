class This
{
	int i,j;
	public void setValue(int i,int k)
	{
		this.i=i;
		j=k;
	}
	public int getValue()
	{
		return i+j;
	}
}
class ThisKeyword
{
	public static void main(String[] args)
	{
		This t = new This();
		t.setValue(101,202);
		System.out.println(t.getValue());
	}
}

