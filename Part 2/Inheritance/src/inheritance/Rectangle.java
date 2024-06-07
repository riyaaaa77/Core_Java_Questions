package inheritance;

public class Rectangle extends Measurement
{
	void area(double l , double w)
	{
		double area = l*w;
		System.out.println(" Area " + area);
	}
	void peri(double l , double w)
	{
		double peri = 2 * (l+w);
		System.out.println(" Perimeter " + peri);
	}
	public static void main(String [] args)
	{
		Rectangle r = new Rectangle();
		r.area(r.l, r.w);
		r.peri(r.l, r.w);
		
	}
}
