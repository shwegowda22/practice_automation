package practice_auto;

class A //Parent class
{
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A //child class
{
	int b;
	void print() {
		System.out.println(b);
	}
}

class C extends B //child class
{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class Inheritance {
	

	public static void main(String[] args) {
		
		
	A aclass= new A();
	aclass.a=100;
	aclass.display();
	
	B bclass= new B();
	bclass.a=200;
	bclass.b=300;
	bclass.display();
	bclass.print();
	
	C cclass= new C();
	cclass.a= 400;
	cclass.b=500;
	cclass.c=600;
	cclass.display();
	cclass.print();
	cclass.show();
	
		

	}

}
