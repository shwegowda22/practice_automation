package practice_auto;

interface i1
{
	int a= 10; // by default variable is static and final
	
	void m1();// abstract method and by default it is public
	
}

public class Interface implements i1 {
	
	public void m1()
	{
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		Interface t= new Interface();
	    t.m1();
	 
	 //another way of instiating 
	 i1 inter= new Interface();
     inter.m1();
	}

}
