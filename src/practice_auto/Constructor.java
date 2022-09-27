package practice_auto;

public class Constructor {
	
	int x;
	int y;
	Constructor()
	{
		x=10;
		y=30;
	}
	Constructor(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Constructor cm1= new Constructor();
		cm1.display();
		Constructor cm2= new Constructor(100,200);
		cm2.display();

	}

}
