class Qus8
{
	public static void basePower(int base , int power)
	{
		int p = 1;
		for(int i = 1; i<=power ; i++)
		{
			p*=base;
		}
		System.out.println(p);
	}
	public static void main(String [] args)
	{
		basePower(2,3);	
	}
}