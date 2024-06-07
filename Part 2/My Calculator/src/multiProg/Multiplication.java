package multiProg;

public class Multiplication {

	public void multi(int a, int b)
	{
		int mul = a*b;
		System.out.println("The multiplication is " + mul);
	}
	public static void main(String [] args)
	{
		Multiplication m = new Multiplication();
		m.multi(3,6);
		
	}
}
