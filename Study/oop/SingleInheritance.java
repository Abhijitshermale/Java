class SingleInheritance{
	void showA(){
		System.out.println("First class Method");
	}
}
class Second extends SingleInheritance{
	void showB(){
		System.out.println("Second class Method");
	}
	public static void main(String[] args){
		SingleInheritance si = new SingleInheritance();
		si.showA();
		//si.showB(); we can not call second class method using first class object
		Second se = new Second();
		se.showA();
		se.showB();

	}
}
