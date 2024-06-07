package inheritance;

public class Semester extends Internal{
	void sumMark(int n , int m)
	{
		System.out.println(n+m);
	}
	void displayDetails(String cname , String name, String branch )
	{
		System.out.println("CName = " + cname);
		System.out.println("Name = " + name);
		System.out.println("Branch = " + branch);	
	}
	public static void main(String [] args)
	{
		Semester s = new Semester();
		s.sumMark(s.mark1, s.mark2);
		s.displayDetails(s.cname, s.name, s.branch);		
	}
}
