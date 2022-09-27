package practice_auto;
class Bank
{
	double rateOfIntrest()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double rateOfIntrest()
	{
		return 2.5;
	}
}
class SBI extends Bank
{
	double rateOfIntrest()
	{
		return 10.5;
	}
}
class Axis extends Bank
{
	double rateOfIntrest()
	{
		return 6.8;
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		ICICI icici= new ICICI();
		System.out.println(icici.rateOfIntrest());
		
		SBI sbi= new SBI();
		System.out.println(sbi.rateOfIntrest());
		
		Axis ax= new Axis();
		System.out.println(ax.rateOfIntrest());

	}

}
