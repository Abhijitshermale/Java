class Animal
{
	public void eat()
	{
		System.out.println("I am eating");
	}	
	public static void main(String[] args){
		System.out.println("HI");
		Animal dog=new Animal();
		dog.eat();
		dog.run();
	}
	public void run(){
		System.out.println("I am running");
	}
}
