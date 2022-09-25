package practice_auto;

public class OverloadMainMethod {
	
	
	public void main(int a)
	{
		System.out.println(a);
	}
	
	public void main(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadMainMethod mm= new OverloadMainMethod();
		mm.main(9);
		mm.main(20,30,60);
	}

}
