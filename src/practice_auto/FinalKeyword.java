package practice_auto;

public class FinalKeyword {
	
	final class Bike
	{
		final void run()
		{
			System.out.println("speed limit");
		}
	}
	
	/*class vespa extends Bike
	{
		void run()
		{
			System.out.println("New bike");
		}

	}*/
	
	//final int speed=40;// cannot change this value
	 int speed=40;

	public static void main(String[] args) {
		
		FinalKeyword fk = new FinalKeyword();
		fk.speed = 100;
		System.out.println(fk.speed);
	}

}
