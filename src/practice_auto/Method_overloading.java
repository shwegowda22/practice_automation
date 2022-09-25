package practice_auto;

public class Method_overloading {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Method_overloading mo = new Method_overloading();
		mo.add(10, 20);
		mo.add(59.6, 54.9);
		mo.add(20, 30.5);
		mo.add(10, 20,30);

	}

}
