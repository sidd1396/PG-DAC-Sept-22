class P9
{
	public static void main(String[] args)
	{
		for(char i='A';i<='E';i++)
		{
			for(int j='E';j>=i;j--)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}

/*
     A
    A B
   A B C
  A B C D
 A B C D E
 
*/