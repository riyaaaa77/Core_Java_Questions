package inheritance;

public class Calculator extends Number {
	
	void sum(int a , int b )
	{
		int sum = a+b;
		System.out.println(sum);
	}
	void sub(int a , int b )
	{
		int sub = a-b;
		System.out.println(sub);
	}
	void mul(int a , int b )
	{
		int mul = a*b;
		System.out.println(mul);
	}
	public static void main(String [] args)
	{
		Calculator c = new Calculator();
		c.sum(c.n1, c.n2);
		c.sub(c.n1,c.n2);
		c.mul(c.n1, c.n2);
	}
}
