class Rose extends Flower
{
	String color = "Red";
	int amt = 10;
	public static void main(String [] args)
	{
		Flower f = new Rose();
		System.out.println(f.no_of_flowers);
		System.out.println(f.flower);
		System.out.println(f.place);
		//System.out.println(f.color);
		//System.out.println(f.amt);

		Rose r = (Rose)f;
		System.out.println(r.no_of_flowers);
		System.out.println(r.flower);
		System.out.println(r.place);
		System.out.println(r.color);
		System.out.println(r.amt);
	}
}