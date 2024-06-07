package arrayQus;

public class ByteArray {
	public static void main(String [] args)
	{
		int c = 0;
		// creating an array
		byte [] arr = new byte[4];
		
		//storing the values in the array
		arr[0] = 5;
		arr[1] = 1;
		arr[2] = 5;
		arr[3] = 8;
		
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
		
		//accessing the elements by using loop
		for(int j = 0 ; j<=arr.length ; j++)
		{
			System.out.print(arr[j]);
		}
		for(int a = arr.length-1 ; a>=0 ; a--)
		{
			System.out.print(arr[a]);
		}
	}
}
