//Write a Java program to insert elements into the linked list at the first and last position.
// Java program to Insert Elements in LinkedList
// at first and last position to showcase
// addFirst() and addlast() Method
  
// Importing required classes
import java.util.*;
  
// Main class
public class Q10 {
  
    // Main driver method
    public static void main(String args[])
    {
        // Creating an empty LinkedList of string type
        LinkedList<String> linkedList
            = new LinkedList<String>();
  
        // Note: By default, elements are inserted at last
  
        // Adding elements to the linkedList
        // using add() method
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
  
        // Printing the elements in current LinkedList
        System.out.println("Linked list: " + linkedList);
  
        // Customly inserting element at first position
        linkedList.addFirst("G");
  
        // Inserting at last position
        linkedList.addLast("s");
  
        // Print the updated LinkedList
        System.out.println("Updated Linked list: "
                           + linkedList);
    }
}