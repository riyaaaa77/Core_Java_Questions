package arrayQus;

public class CharArray {
	public static void main(String [] args)
	{
		int c = 0;
		// creating an array
		char [] arr = new char[6];
		
		//storing the values in the array
		arr[0] = 'r';
		arr[1] = 'i';
		arr[2] = 'y';
		arr[3] = 'a';
		arr[4] = '@';
		arr[5] = '7';
		
		//Reference address of the array
		System.out.println("Address of the array is : "+ arr);
		
		//number of elements in array
		for(int i = 1; i<=arr.length ; i++)
		{
			c++;
		}
		System.out.println("Number of elements present in the array is : "+c);
		
		//printing every element of the array
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		//accessing the elements by using loop
		for(int j = 0 ; j<arr.length ; j++)
		{
			System.out.print(arr[j] + " ");
			
		}
		System.out.println(" ");
		for(int a = arr.length-1 ; a>=0 ; a--)
		{
			System.out.print(arr[a] + " ");
		}
	}
}
