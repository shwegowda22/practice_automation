package practice_auto;

public class Multi_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring array
		int a[][]= new int [3] [2];
		
         a[0][0] =100;
         a[0][1]=200;
         
         a[1][0]=300;
         a[1][1]=400;
         
         a[2][0]=500;
         a[2][1]=600;
         
         //declaring array without specifying size
         
         int arr[][]={ {100,200}, {300,400},{500,600}};
         
         //printing the size of an array
         
         System.out.println("Number of rows:" + a.length);
         System.out.println("Number of columns:" + a[0].length);
         
         // printing the array dynamically
         
         for (int i=0; i<a.length;i++)
         {
        	 for (int j=0; j<arr[i].length;j++)
        	 {
        		 System.out.println(a[i][j]);
        	 }
         }
         
         // printing array using enhanced loop
         
         for (int r[]:a)
         {
        	 for (int i:r)
        	 {
        		System.out.println(i) ;
        	 }
         }
         
		

	}

}
