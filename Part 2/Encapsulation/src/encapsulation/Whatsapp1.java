package encapsulation;

public class Whatsapp1 {
	public static void main(String [] args)
	{
		Whatsapp w = new Whatsapp(3456789657l,"something", "developer");
		System.out.println(w.getBio());
		System.out.println(w.getPh_no());
		w.setPh_no(7289059149l);
		System.out.println(w.getPh_no());
		System.out.println(w.getStatus());
	}

}
