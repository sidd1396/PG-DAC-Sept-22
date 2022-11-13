import java.lang.*;
import java.util.*;

class ValidShuffleOfStrings17{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string 2 : ");
		String s2 = sc.nextLine();
		
		System.out.println("Enter the string to check : ");
		String s3 = sc.nextLine();
		
		String s4 = s1 + s2;
		
		s3 = s3.toLowerCase();
		s4 = s4.toLowerCase();
		
		char array1[] = s3.toCharArray();
		char array2[] = s4.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		boolean res = Arrays.equals(array1, array2);
		
		if(res){
			
			System.out.println("String is valid shuffle of two strings");
		}
		
		else{
			
			System.out.println("String is not a valid shuffle of two string");
		}
	}
}