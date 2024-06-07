package inheritance;

public class Cauliflower extends Vegetable
{
	double price = 40;
	public static void main(String [] args)
	{
		Vegetable v = new Cauliflower(); //Upcasting 
		System.out.println(v.origin);
		//System.out.println(v.price);
		
		Cauliflower c = (Cauliflower) v ; //Downcasting
		System.out.println(c.origin);
		System.out.println(c.price);
	}
}
