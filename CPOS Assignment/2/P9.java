class P9
{
	public static void main(String args[])
	{
		for(int i=1;i<5;i++) //row
		{
		for(int j=5;j>i;j--) //column
			{
				System.out.print("  ");//printing space
			}
		for(int j=1;j<=i;j++) //column
			{
				System.out.print("* ");//printing column
			}
				System.out.println();
		}
		for(int i=5;i>=1;i--) //row
		{
		for(int j=5;j>i;j--) //column
			{
				System.out.print("  ");//printing space
			}
		for(int j=1;j<=i;j++) //column
			{
				System.out.print("* ");//printing column, if we are giving space while printing column then we need to add one more space while printing space
			}
				System.out.println();
		}
	}
}	