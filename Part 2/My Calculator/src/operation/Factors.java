package operation;

public class Factors {
	public static void fact(int n)
	{
		for(int i =1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String [] args)
	{
		fact(6);
	}

}
