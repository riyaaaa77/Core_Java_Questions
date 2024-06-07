package operation;

public class Power {
	public void pwr(int p, int b)
	{
		int pw =1;
		while(p>0)
		{
			pw *=b;
			p--;
		}
		System.out.println(pw);
	}
	public static void main(String [] args)
	{
		Power pr = new Power();
		pr.pwr(4,2);
	}
}
