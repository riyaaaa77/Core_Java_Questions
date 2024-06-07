package Custom_Exception;

public class InvalidPaw extends Exception {
	public String getMessage()
	{
		return "Invalid Password";
	}
}
