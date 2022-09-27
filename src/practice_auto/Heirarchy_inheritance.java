package practice_auto;
class parent
{
	int p;
	void display()
	{
		System.out.println(p);
	}
}

class child1 extends parent
{
	int x;
	void print()
	{
		System.out.println(x);
	}
}

class child2 extends parent
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}


public class Heirarchy_inheritance {
	
	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.p=20;
		c1.x=56;
		c1.display();
		c1.print();
		
		child2 c2 = new child2();
		c2.p=30;
		c2.y=78;
		c2.display();
		c2.show();
		
		
	}
}
