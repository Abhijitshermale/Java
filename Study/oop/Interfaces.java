interface I1
{
	void show();
}
interface I2
{
	void display();
}
class Interfaces implements I1,I2
{
	 public void show()
        {
                System.out.println("This is I1 Method ");
        }
	public void display()
        {
                System.out.println("This is I2 Method");
        }
	public static void main(String[] args)
	{
		Interfaces i=new Interfaces();
		i.show();
		i.display();
	}



}

