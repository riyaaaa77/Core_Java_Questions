package encapsulation;

public class Whatsapp {
	private long ph_no ;
	private String status;
	private String bio;
	
	public Whatsapp(long ph_no, String status, String bio)
	{
		this.ph_no = ph_no;
		this.status = status;
		this.bio = bio;
	}
	public long getPh_no()
	{
		return ph_no;
	}
	public void setPh_no(long ph_no)
	{
		this.ph_no = ph_no;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public String getBio()
	{
		return bio;
	}
	public void setBio(String bio)
	{
		this.bio = bio;
	}
}
