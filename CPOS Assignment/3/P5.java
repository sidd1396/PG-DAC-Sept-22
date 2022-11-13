class P5
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--) //row
		{
		for(int j=1;j<i;j++) //column
			{
				System.out.print("  ");//printing space
			}
			int k=i;
		for(int j=9;j>=i;j--) //column
			{
				System.out.print(k+" ");
				k++;            //printing column, if we are giving space while printing column then we need to add one more space while printing space
			}
			int l=8;
		for(int j=9;j>i;j--) //column
			{
				System.out.print(l+" ");
				l--; 
			}
			System.out.println();
		}
	}
}	