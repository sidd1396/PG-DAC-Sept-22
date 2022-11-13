class pattern16
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--) //row
		{
			for(int j=5;j>=i;j--) //column
			{
				System.out.print(j+" ");//printing column
			}							
			System.out.println();
		}
	}
}	