package practice_auto;

public class calculation_method {
	
	
	
		int x= 10;
		int y=20;
		
		//no parameters and no return value
		
		void sum()
		{
			System.out.println(x+y);
		}
		//no parameters but returning value
		
		int sum1()
		{
			return(x+y);
		}
		
		//parameters but not returning value
		void sum2(int a, int b)
		{
			System.out.println(a+b);
		}
		//both parameters and returning value
		int sum3(int i,int j)
		{
			return(i+j);
		}


	public static void main(String[] args) {
	
  calculation_method cal= new calculation_method();
cal.sum();
	
int res= cal.sum1();
System.out.println(res);

cal.sum2(100,200);

System.out.println(cal.sum3(12,13));
}
}
