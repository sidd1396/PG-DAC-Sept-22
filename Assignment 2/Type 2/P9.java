import java.util.Scanner;

class P9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT:

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P9
Enter a number of rows
5
     *
    **
   ***
  ****
 *****
  ****
   ***
    **
     *

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>

*/