package excepion;

public class NullPointerExcep {
	public static void main(String [] args)
	{
		try {
			m1();
		}
		catch(NullPointerException n)
		{
			System.out.println("Exception handled");
		}
	}
	public static void m1() throws NullPointerException
	{
		String  s = null;
		System.out.println(s);
		System.out.println(s.length());
	}
}
