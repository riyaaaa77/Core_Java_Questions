package classes;
import interfaces.A;
import interfaces.B;
import interfaces.C;
import interfaces.D;
import classes.E;

public class Calculator extends E implements A,B,C,D {
	private int res;
	
	public int getres()
	{
		return res;
	}
	
	public void add(int a , int b)
	{
		res = a+b;
	}
	public void add(int a , int b , int c)
	{
		res = a+b+c;
	}
	public void sub(int a , int b)
	{
		res = a-b;
	}
	public void mul(int a , int b)
	{
		res = a*b;
	}
	public void div(int a , int b)
	{
		res = a/b;
	}
	public void sqr(int a)
	{
		res = a*a;
	}
	public void cube(int a)
	{
		res = a*a*a;
	}
	
}
