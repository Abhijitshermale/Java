// class FibonanciSeriesUsngRecursion
// {
// 	static int a=0,b=1,c;
// 	public static void main(String args[])
// 	{
// 		System.out.print(a+" "+b);
// 		FibonanciSeriesUsngRecursion ob = new FibonanciSeriesUsngRecursion();
// 		ob.printFib(10);
// 	}
// 	void printFib(int i)
// 	{
// 		if(i>=1)
// 		{
// 			c=a+b;
// 			System.out.print(" "+c);
// 			a=b;
// 			b=c;
// 			printFib(i-1);
// 		}
// 	}
// }

class FibonanciSeriesUsngRecursion{
	public static void fibo(int a, int b , int c)
	{
		if (c == 0)
			return;	
		
		System.out.print(a + b +" ");
		fibo(b, a+b, --c);
	}
	public static void main(String[] args) {
		System.out.println("Fibonanci Series");
		System.out.print("0 1 ");
		fibo(0, 1, 10);
	}
}