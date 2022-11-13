//5. Write a Java program to reverse elements in a array list.

import java.util.*;
class Q5
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
		
		System.out.println("\n Reverse Element from Arraylist: ");
		Collections.reverse(list);
		System.out.println("\n ArrayList after Reverse:");
		display(list);
	}
}	