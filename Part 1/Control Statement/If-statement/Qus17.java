class Qus17
{
	public static void main(String [] args)
	{
		char c = '@';
		if((!(c>='a' && c<='z')) && (!(c>='A' && c<='Z')) && (!(c>='0' && c<='9')))
		{
			System.out.println("The character is Special Character");
		}	
	}
}