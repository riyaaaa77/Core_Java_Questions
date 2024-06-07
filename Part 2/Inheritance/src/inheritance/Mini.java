class Mini extends Cab
{
	double price = 500;
	String model = "Mini";
	public static void main(String [] args)
	{
		Cab c = new Mini(); //upcasting
		//System.out.println(c.price);
		//System.out.println(c.model);
		System.out.println(c.location);
		System.out.println(c.num);

		Mini m = (Mini) c; //downcasting
		System.out.println(m.price);
		System.out.println(m.model);
		System.out.println(m.location);
		System.out.println(m.num);
	}
}