package inheritance;

public class SumSub extends Data1 {
	void sum(int n , int m)
	{
		int sum = n+m;
		System.out.println(sum);
	}
	void sub(int n , int m)
	{
		int sub = n-m;
		System.out.println(sub);
	}
	public static void main(String [] args)
	{
		SumSub ss = new SumSub();
		ss.sum(ss.n1, ss.n2);
		ss.sub(ss.n1, ss.n2);
		
	}
}
