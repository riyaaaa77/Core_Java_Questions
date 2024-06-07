class Qus17
{
	public static void main(String [] args)
	{
		char c = '@';
		if(((c>='A')&&(c<='Z'))&&((c>='a')&&(c<='z'))&&(c>='0')&&(c<='9'))
		{
			System.out.println("Character is a digit");
		}else
		{
			System.out.println("Character is not a digit");
		}
	}
}