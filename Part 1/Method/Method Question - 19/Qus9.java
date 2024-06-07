class Qus9
{
	public static void lowerToUpper(char ch)
	{
		if((ch>='a')&&(ch<='z'))
		{
			char c = (char)(ch - 32);
			System.out.println(c);	
		}else
		{
			System.out.println("The character is not in lowercase");
		}
	}
	public static void main(String [] args)
	{
		lowerToUpper('g');
	}
}