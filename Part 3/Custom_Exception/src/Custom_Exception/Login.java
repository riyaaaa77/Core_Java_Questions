package Custom_Exception;

public class Login {
	private int id;
	private String name;
	
	public void getName(int id)
	{
		if(this.id == id)
		{
			System.out.println(name);
		}
		else
		{
			try {
				throw new InvalidPaw();
			}
			catch(InvalidPaw s)
			{
				System.out.println(s.getMessage());
			}
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Login(String name , int id)
	{
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args)
	{
		Login l = new Login("Riya" , 7);
		l.getName(7);
		System.out.println("Thankss");
	}
	
}
