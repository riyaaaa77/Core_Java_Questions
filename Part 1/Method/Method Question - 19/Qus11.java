class Qus11
{
	public static void upperToLower(char ch)
	{
		if((ch >='A') && (ch <= 'Z'))
		{
			char c = (char)(ch + 32);
			System.out.println(c);
		}
		else if((ch >='a')&&(ch <= 'z'))
		{
			char c1 = (char)(ch -32);
			System.out.println(c1);
		}else 
		{
			System.out.println("The character is nither in Upper case nor in lower case");
		}
	}
	public static void main(String [] args)
	{
		upperToLower('G');
	}
}