class Qus16
{
	public static void main(String [] args)
	{
		char c = 'S';
		if((c>='A' && c<='Z')&&(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
		{
			System.out.println("Character is in Uppercase and vowel");
		}else
		{
			System.out.println("Character is not in Uppercase or in vowel");
		}
	}
}