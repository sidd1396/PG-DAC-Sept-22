class pattern18
{
	public static void main(String args[])
	{
		for(char i=69;i>=65;i--) //row
		{
			for(char j=65;j<=i;j++) //column
			{
				System.out.print(j+" ");//printing column
			}							
			System.out.println();
		}
	}
}	