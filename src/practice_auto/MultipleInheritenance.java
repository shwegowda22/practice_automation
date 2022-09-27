package practice_auto;


interface ABC
{
	int a= 100;
	void m1();
}

interface XYZ
{
	int b=200;
	void m2();
}

interface YTR
{
	int c =300;
	void m3();
}


public class MultipleInheritenance implements ABC,XYZ,YTR {
	
	public void m1()
	{
		System.out.println(a);
	}

	public void m2()
	{
		System.out.println(b);
	}
	
	public void m3()
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		MultipleInheritenance mi= new MultipleInheritenance();
		mi.m1();
		mi.m2();
		mi.m3();

	}

}
