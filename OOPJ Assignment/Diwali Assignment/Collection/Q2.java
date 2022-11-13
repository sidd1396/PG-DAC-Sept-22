//2. Write a Java program to insert an element into the array list at the first position.

import java.util.*;
class Q2
{
	static void display(List<String> list)
	{
	  for(String s:list)
	  {
	     System.out.println(s);
      } 
	} 
	public static void main(String args[])
	{
		List<String>list=new ArrayList<String>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Brown");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		list.add("Yellow");	
		
		System.out.println("\nElements in ArrayList:\n");
		display(list);
		
		System.out.println("\nArraylist after adding element at zeroth index:\n");
		list.add(0,"Gray");
		display(list);
	}
}	