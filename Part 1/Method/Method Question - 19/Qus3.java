class Qus3
{
	public static int pro(int n)
	{
		int prod = 1;
		while(n>0)
		{
			int rem = n%10;
			prod *= rem;
			n /= 10;
		}
		return prod;
		
	}
	public static void main(String [] args)
	{
		System.out.println(pro(566));
	}
}