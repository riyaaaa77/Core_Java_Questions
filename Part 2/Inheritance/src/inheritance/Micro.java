class Micro extends Cab
{
	double price = 500;
	String model = "Micro";
	public static void main(String [] args)
	{
		Cab c = new Micro(); //upcasting
		System.out.println(c.price);
		System.out.println(c.model);
		System.out.println(c.location);
		System.out.println(c.num);

		Micro mi = (Micro) c; //downcasting
		System.out.println(mi.price);
		System.out.println(mi.model);
		System.out.println(mi.location);
		System.out.println(mi.num);
	}
}