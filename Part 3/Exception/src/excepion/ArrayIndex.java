package excepion;

public class ArrayIndex {
	public static void main(String [] args) {
		try {
			m1();
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Exception handled");
		}
		System.out.println("bye");
	}
	public static void m1() throws ArrayIndexOutOfBoundsException
	{
		int [] arr = {78,57,36,9};
		
		System.out.println(arr[2]);
		System.out.println(arr[5]);
	}
}
