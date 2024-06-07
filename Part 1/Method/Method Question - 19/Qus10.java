class Qus10
{
	public static void upperToLower(char ch)
	{
		if((ch >='A') && (ch <= 'Z'))
		{
			char c = (char)(ch + 32);
			System.out.println(c);
		}else
		{
			System.out.println("The character is not in Upper case");
		}
	}
	public static void main(String [] args)
	{
		upperToLower('H');
	}
}