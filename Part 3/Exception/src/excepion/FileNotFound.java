package excepion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFound {
	public static void main(String [] args) throws FileNotFoundException
	{
		m2();
	}
	public static void m2()
	{
		System.out.println("hyyy");
		try {
			m1();
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Exception handled");
		}
	}
	public static void m1() throws FileNotFoundException
	{
		System.out.println("Hyy from m1");
		FileOutputStream f = new FileOutputStream("c:part3/abc");
	}
}
