package stringChar;
import java.util.Scanner;
public class CharString {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		System.out.println("The string is : " + s);
		
		char [] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		sc.close();
	}
}
