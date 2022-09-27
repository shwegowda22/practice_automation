package practice_auto;

public class Animal {

	String color="white";
	void newcolor()
	{
		System.out.println("Red");
	}
	
	Animal()
	{
		System.out.println("Animal Created");
	}
	
}

class Dog extends Animal
{
	
	String color ="black";
	
	void displayColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	void newcolor()
	{
		System.out.println("Maroon");
		super.newcolor();
	}
	Dog()
	{
		super();
		System.out.println("New dog Created");
	}
}
	
