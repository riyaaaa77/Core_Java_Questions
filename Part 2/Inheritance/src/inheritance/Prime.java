class Prime extends Cab
{
	double price = 500;
	String model = "Prime";
	public static void main(String [] args)
	{
		Cab c = new Prime(); //upcasting
		System.out.println(c.price);
		System.out.println(c.model);
		System.out.println(c.location);
		System.out.println(c.num);

		Prime p  = (Prime) c; //downcasting
		System.out.println(p.price);
		System.out.println(p.model);
		System.out.println(p.location);
		System.out.println(p.num);
	}
}