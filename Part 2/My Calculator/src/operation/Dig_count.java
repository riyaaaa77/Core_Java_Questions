package operation;

public class Dig_count {
	public void count(int n)
	{
		int c=0;
		while(n>0)
		{
			int rem = n%10;
			c++;
			n/=10;
		}System.out.println(c);
	}
	public static void main(String [] args)
	{
		Dig_count dc = new Dig_count();
		dc.count(5678);
	}

}
