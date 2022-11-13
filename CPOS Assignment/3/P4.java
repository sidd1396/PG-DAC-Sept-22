class P4
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++) //row
		{
		for(int j=9;j>i;j--) //column
			{
				System.out.print("  ");//printing space
			}
		for(int j=1;j<=i;j++) //column
			{
				System.out.print(j+" ");//printing column, if we are giving space while printing column then we need to add one more space while printing space
			}
			int k=i-1;
		for(int j=1;j<i;j++) //column
			{
				System.out.print(k+" ");
				k--; 
			}	
			System.out.println();
		}
	}
}	