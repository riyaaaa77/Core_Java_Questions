package subProg;

public class Subtraction {
	public void sub(int a,int b)
	{
		int subs = a-b;
		System.out.println(subs);
	}
	public static void main(String [] args)
	{
		Subtraction s = new Subtraction();
		s.sub(45, 5);
	}


}
