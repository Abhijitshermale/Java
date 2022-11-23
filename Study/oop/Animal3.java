class Animal3{
	int age;
	String color;
	void initObj(int age,String color){
		this.age=age;
		this.color=color;
	}
	void display(){
		System.out.println(age+" "+color);
	}
	public static void main(String[] args){
		Animal3 obj = new Animal3();
		obj.initObj(10,"black");
		obj.display();
	}
}
