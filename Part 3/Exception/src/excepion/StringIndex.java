package excepion;

public class StringIndex {
	public static void main(String [] args)
	{
		try {
		m1();
		}
		catch(StringIndexOutOfBoundsException s1) {
			System.out.println("Exception");
		}
	}
	public static void m1() throws NullPointerException
	{
		String s = "hello";
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(7));
	}
}
