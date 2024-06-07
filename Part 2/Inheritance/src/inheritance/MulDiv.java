package inheritance;

public class MulDiv extends Data1 {
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
		MulDiv md = new MulDiv();
		md.mul(md.n1, md.n2);
		md.div(md.n1, md.n2);
		
	}

}
