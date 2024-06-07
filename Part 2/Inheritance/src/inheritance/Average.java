package inheritance;

public class Average extends Data {
	void avg(int n , int m)
	{
		int avg = (n+m)/2;
		System.out.println(avg);
	}
	public static void main(String [] args)
	{
		Average a = new Average();
		a.avg(a.n1,a.n2);
	}
}
