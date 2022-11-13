class pattern10{
	public static void main(String args[]){
	for(char i=69; i>=65; i--)
	{
	for (char j=65; j<i; j++)
	{
	System.out.print(" ");
	}
	char k=i;
	for (char j=69; j>=i; j--)
	{
	System.out.print(k+" ");
	k++;	
	}
	System.out.println();
	}
}
}
