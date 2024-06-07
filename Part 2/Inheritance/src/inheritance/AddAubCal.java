package inheritance;

public class AddAubCal extends Data
{
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
		AddAubCal as = new AddAubCal();
		as.sum(as.n1, as.n2);
		as.sub(as.n1, as.n2);
		
	}
}
