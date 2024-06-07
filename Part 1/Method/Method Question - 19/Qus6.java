class Qus6
{
	public static void fact(int n)
	{
		int i = 1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		i++;
		}	
	}
	public static void main(String [] args)
	{
		fact(27);
	}

}