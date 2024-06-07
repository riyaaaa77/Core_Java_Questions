class Qus5
{
	public static void count(int n)
	{
		int count = 0;
		while(n>0)
		{
			rem = n%10;
			count++;
			n/=10; 

		}
		System.out.println(count);
	}
	public static void main(String [] args)
	{
		count(87654432);
	}
}