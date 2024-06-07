class Qus2
{
	public static void add(int a)
	{
		int sum = 0;
		while(a>0)
		{
			int rem = a%10;
			sum += rem;
			a /= 10;
		}
		System.out.println("Sum of digits is " + sum);
	}
	public static void main(String [] args)
	{
		add(6878);
	}
}