package practice_auto;

public class Single_dim_array {

	public static void main(String[] args) {
		//declaring array with specific size
		int arr[]= new int [5];
		
		//storing value in array
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=40;
		
		// declaring array without specifying the length
		int arr1[]= {98,38,87,93,90};
		
		//printing the length of the array
		System.out.println("Length of my array is:"+arr1.length);
		
		//Reading specific value from array
		System.out.println(arr[1]);
		
		
		//Reading values from array using loop
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

		//Read values using enhanced loop
		for(int e:arr1)
		{
			System.out.println(e);
		}
	}

}
  