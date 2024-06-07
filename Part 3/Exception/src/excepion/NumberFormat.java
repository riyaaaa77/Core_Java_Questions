package excepion;

public class NumberFormat {
	public static void main(String [] args)
	{
		try {
			m1();
		}
		catch(NumberFormatException n)
		{
			System.out.println("Exception handled");
		}
	}
	public static void m1() throws NullPointerException
	{
		String s = "hy";
		int a = Integer.parseInt(s);
	}
}
