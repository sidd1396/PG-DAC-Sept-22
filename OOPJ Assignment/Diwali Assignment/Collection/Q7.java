/*7. Write a Java program to print all the elements of a ArrayList using the position of the 
elements.*/

import java.util.*;
class Q7
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
		
		System.out.println("\nArrayList using position of Element : ");
		int num=list.size();
		System.out.println("\n  Size of ArrayList is :"+num);
		for(int i=0;i<num;i++)
		{
			System.out.println("\n Element at index :"+i);
		}	
	}
}	