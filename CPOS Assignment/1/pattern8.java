class pattern8{
	public static void main(String args[]){
	for(int i=5; i>=1; i--)
	{
	for (int j=1; j<i; j++)
	{
	System.out.print(" ");
	}
	int k=i;
	for (int j=5; j>=i; j--)
	{
	System.out.print(k+" ");
	k++;	
	}
	System.out.println();
	}
}
}
