class pattern9{
	public static void main(String args[]){
	for(char i=65; i<=69; i++)
	{
	for (char j=69; j>i; j--)
	{
	System.out.print(" ");	
	}
	for (char j=65; j<=i; j++)
	{
	System.out.print(j+" ");
	}
	System.out.println();
	}
}
}
