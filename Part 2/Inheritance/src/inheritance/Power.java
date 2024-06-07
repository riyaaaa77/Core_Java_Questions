package inheritance;

public class Power extends Number1 {
	void square(int n)
	{
		int sq = n*n;
		System.out.println(sq);
	}
	void cube(int n) 
	{
		int c = n*n*n;
		System.out.println(c);
	}
	public static void main(String [] args)
	{
		Power p = new Power();
		p.square(p.n);
		p.cube(p.n);
	}
}
