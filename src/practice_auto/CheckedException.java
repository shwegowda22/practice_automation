package practice_auto;

public class CheckedException {

	public static void main(String[] args)  {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
