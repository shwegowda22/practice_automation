package practice_auto;

class A1
{
	void m1()
	{
		System.out.println("This is method 1");
	}
}

interface B1
{
	void b1();
}

interface B2
{
	void b2();
}


public class HybridInheritenance extends A1 implements B1,B2 {
	
	public void b1()
	{
		System.out.println("This is interface method 1");
	
	}
	public void b2()
	{
		System.out.println("This is interface method 2");
	
	}

	public static void main(String[] args) {
		HybridInheritenance hi= new HybridInheritenance();
		hi.m1();
		hi.b1();
		hi.b2();

	}

}
