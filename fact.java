//calculate the factorial

class fact
{
	public static void main(String[] arr)
	{
	int i,fact=1;
	int n=5;
	for(i=1;i<=n;i++)
		{
			fact=fact*i;		
		}
	System.out.println("Fact of the " +n+ " is "+fact);
	}
}
