package practice_auto;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaring an Array
		ArrayList list = new ArrayList ();// store any type of elements
		
		//ArrayList <Integer> list = new ArrayList <Integer> (); //store specific type of elements
		
		//Adding diff datatype elements to an array
		
		list.add("test");
		list.add(9);
		list.add(8.5);
		list.add("unit");
		
       //Adding same datatype elements to an array
		
		/*list.add(6);
		list.add(9);
		list.add(7);
		list.add(4);*/
		
		//finding size of an array
		System.out.println("Length before removing values:" +list.size());
		System.out.println("List before removing values:" +list);
		
		//removing an element
		list.remove(1);
		System.out.println("Length after removing values:" +list.size());
		System.out.println("List after removing values:" +list);
		
		//inserting a new value in the middle of arraylist
		list.add(1,78);
		System.out.println("Length after inserting values:" +list.size());
		System.out.println("List after inserting values:" +list);
		
		//Printing all values in array of same datatype
		/*for (int i:list)
		{
			System.out.println(i);
		}*/
		
		//Printing all values in array of diff datatype
		for (Object s:list)
		{
			System.out.println(s);
		}
		

	}

}
