class Qus7
{
	public static void factorial(int n)
	{
		int fact = 1;
		int i = n;
		while(i>0)
		{
			fact *= i;
			i--;	
		}
		System.out.println(fact);		 
	}
	public static void main(String [] args)
	{
		factorial(5);
	}
}