class P14
{
	public static void main(String args[])
	{
		for(int i=5;i>1;i--) //row
		{
			for(int j=5;j>i;j--) //column
			{
				System.out.print(" ");//printing column
			}		
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("* ");//printing column
			}							
			System.out.println();
		}
		for(int i=1;i<=5;i++) //row
		{
			for(int j=5;j>i;j--) //column
			{
				System.out.print(" ");//printing column
			}		
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("* ");//printing column
			}							
			System.out.println();
		}
	}
}	
