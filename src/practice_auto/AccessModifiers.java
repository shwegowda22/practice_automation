package practice_auto;

class privateDemo
{
	//private access modifier
	private int val=45;
	private void m1(){};
	
	//default access modifier
	int r=56;
	void m2()
	{
		System.out.println(r);
	}

}

public class AccessModifiers {

	public static void main(String[] args) {
		
		privateDemo pd= new privateDemo();
		// pd.val=67; compile time error
		// pd.m1(); compile time error
		
		pd.r=49;
		pd.m2();
	}

}
