package practice_auto;

public class Thiskeyword {
	
	int a,b;
	
	void setValues (int a, int b)
	{
		this.a= a;
		this.b=b;
	}
	
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
	
		Thiskeyword key = new Thiskeyword();
		key.setValues(20,30);
		key.print();
	}
 
}
