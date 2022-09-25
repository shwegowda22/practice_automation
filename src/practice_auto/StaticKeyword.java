package practice_auto;

public class StaticKeyword {
	
	
	static int s= 10; //static variable
	int r= 20; //non static variable
	
	
	//static method
	static void m1()
	{
		System.out.println("m1");
	}
	
	//non-static_method
	 void m2()
	{
		System.out.println("m2");
	}
	 
	 void m3()
	 {
		 System.out.println(s);
		 System.out.println(r);
		 m1();
		 m2();
	 }
	

	public static void main(String[] args) {
		System.out.println(s);
		m1();
		
		/* if main is in diff class use below method- include class name
		System.out.println(StaticKeyword.s);
		StaticKeyword.m1();*/
		
		//System.out.println(r); incorrect because r is not static variable
		// m2();incorrect because m2 is not static method
		
		
		// static methods can also access non-static through object
		StaticKeyword sk= new StaticKeyword();
		System.out.println(sk.r);
		sk.m2();
		sk.m3();
	}

}
