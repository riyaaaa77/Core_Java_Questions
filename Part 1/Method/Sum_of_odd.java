class Sum_of_odd
{
	public static void sumOfDigits(int n)
	{
		int sum=0, rem;
		while(n>0)
		{
			rem = n%10;
			if(rem%2!=0)
			{
				sum += rem;
			}
			n /= 10;
		}
		System.out.println(sum);
	}
	public static void main(String [] args)
	{
		sumOfDigits(666);
	}

}