package practice_auto;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		int a = 100;
		try
		{
			System.out.println(a/0); //arithmeticexception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered catch block");
		}
		
		
		String s=null ;
		try
		{
			System.out.println(s.length());//nullpointerexception
		}
		catch (Exception e)
		{
			System.out.println("second catch block");
		}
		
		
	/*String x="ABC";
		int i =Integer. parseInt(x); //numberformatexpection
		
		int arr[]= new int [5];
		arr[10]= 6; //arrayindexoutofboundexpection*/
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
