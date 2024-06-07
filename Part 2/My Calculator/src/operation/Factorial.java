package operation;

public class Factorial {
	public static void facto(int n)
	{
		int f = 1;
		for(int i = 1; i<=n; i++)
		{
			f = f*i;
		}System.out.println(f);
	}
	public static void main(String [] args)
	{
		facto(5);
	}
}
