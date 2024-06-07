class Sum_of_prime
{
	public static void sumOfDigits(int n)
	{
		int i = 1,ctr = 0, sum =0;
		while(i<=n)
		{
			int rem = n%10;
			for(int j = 1; j<=rem; j++)
			{
				if(rem%j==0)	
				{
					ctr++;	
					System.out.println(rem);
				}
			} 
			n/=10;
		}
			
	}
	public static void main(String [] args)
	{
		sumOfDigits(123);
	}

}