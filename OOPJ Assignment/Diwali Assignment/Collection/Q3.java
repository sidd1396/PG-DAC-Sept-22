//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
class Q3
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
		
		System.out.println("\n Retrive Element from Arraylist: ");
		String temp=list.get(2);
		System.out.println("\n Retrived element is: "+temp);
	}
}	