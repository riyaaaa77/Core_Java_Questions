package arrayQus;

public class FloatArray {
	public static void main(String [] args)
	{
		int c = 0;
		// creating an array
		float [] arr = new float[4];
		
		//storing the values in the array
		arr[0] = 5.9f;
		arr[1] = 9.00f;
		arr[2] = 2.45f;
		arr[3] = 8.78f;
		
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
