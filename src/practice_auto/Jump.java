package practice_auto;

public class Jump {

	public static void main(String[] args) {
		for(int i=1; i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
				
			System.out.println(i);
		}
		
		for(int y=1; y<=10;y++)
		{
			if(y==5)
			{
				continue;
			}
				
			System.out.println(y);
		}
		for(int u=1; u<=10;u++)
		{
			if(u==5 || u==3 ||u==7)
			{
				continue;
			}
				
			System.out.println(u);
		}

	}

}
