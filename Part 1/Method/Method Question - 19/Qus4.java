class Qus4
{
	public static void evenSum(int n)
	{
		int sum = 0; 
		while(n>0)
		{
		int rem = n%10;
			if(rem%2==0)
			{
				sum = sum+rem;
			}
		n /= 10;

		}
		System.out.println("Sum of even digits:" + sum);
	
	}
	public static void main(String []  args)
	{
		evenSum(5566);
	}
}