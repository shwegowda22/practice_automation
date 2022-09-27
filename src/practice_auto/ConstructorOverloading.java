package practice_auto;

public class ConstructorOverloading {
	
	
	 ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	 ConstructorOverloading(int a, double b)
	{
		System.out.println(a+b);
	}
	 ConstructorOverloading(double a, double b)
	{
		System.out.println(a+b);
	}
	 ConstructorOverloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading(10,60);
		ConstructorOverloading co1 = new ConstructorOverloading(10,21.5);
		ConstructorOverloading co2 = new ConstructorOverloading(30.5,45.0);
		ConstructorOverloading co3 = new ConstructorOverloading(20,30,40);
		

	}

}
