package inheritance;

public class MulDiv1 extends AddAubCal{
	
	void mul(int n , int m)
	{
		int mul = n*m;
		System.out.println(mul);
	}
	void div(int n , int m)
	{
		int div = n/m;
		System.out.println(div);
	}
	public static void main(String [] args)
	{
		MulDiv1 md = new MulDiv1();
		md.mul(md.n1, md.n2);
		md.div(md.n1, md.n2);
	}
}
