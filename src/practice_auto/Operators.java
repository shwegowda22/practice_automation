package practice_auto;

public class Operators {

	public static void main(String[] args) {
		int a= 10; 
		int b =20;
		
		//Arithmetic operators
		System.out.println("--------Arithmetic operators-------");
		System.out.println(a+b);
		System.out.println("Sum of a and b is:" +a+b);
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:" +(b-a));
		System.out.println("Mul of a and b is:" +(a*b));
		System.out.println("Div of a and b is:" +(a/b));
		System.out.println("Per of a and b is:" +(a%b));
		
		//Relational operators
		System.out.println("--------Relational operators-------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical operators
		System.out.println("--------Logical operators-------");
		boolean q = true;
		boolean r= false;
		System.out.println(q && r);
		System.out.println(q || r);
		System.out.println(!q);
		
		//increment and decrement operators
		System.out.println("--------Increment and Decrement operators-------");
		a++;
		a=a+1;
		System.out.println(a);
		
		b--;
		System.out.println(b);
		
		

	}

}
