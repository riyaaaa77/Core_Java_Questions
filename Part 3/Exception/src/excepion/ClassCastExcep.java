package excepion;

public class ClassCastExcep extends Parent {
	public static void main(String [] args)
	{	
		try {
		m2();
		}
		catch(ClassCastException c){
			System.out.println("Exception Handled");
		}
	}
	public static void m1() throws ClassCastException
	{
		Parent p = new Parent();
		ClassCastExcep c = (ClassCastExcep)p ;
	}
	public static void m2() throws ClassCastException
	{
		System.out.println("Hy");
		m1();
		System.out.println("Byy");
	}
}
