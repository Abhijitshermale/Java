class Inheritance1
{
	void eat(){
		System.out.println("I am eating");
	}
}
class Dog extends Inheritance1{
	public static void main(String[] args){
		Dog d= new Dog();
		d.eat();
	}
}
