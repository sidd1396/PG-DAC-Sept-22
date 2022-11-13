class pattern17
{
	public static void main(String args[])
	{
		int num=1;
		for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(num+" ");//printing column
				num++;	
			}				
					
			System.out.println();
		}
	}
}	