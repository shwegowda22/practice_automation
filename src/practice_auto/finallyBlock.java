package practice_auto;

public class finallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is started");
		
		int a = 100;
		try
		{
			System.out.println(a/0); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered catch block");
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		System.out.println("Program is completed");

	}

}
