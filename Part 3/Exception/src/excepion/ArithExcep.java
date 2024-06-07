package excepion;

public class ArithExcep {
	public static void main(String [] args)
	{
		m2();
	}
	public static void m1() throws ArithmeticException
	{
		int a = 5;
		int b = 0;
		System.out.println(a);
		System.out.println(a/b);
		System.out.println("bye");
		
	}
	public static void m2()
	{
		try{
			m1();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception");
		}
		System.out.println("byee");
	
	}
}
