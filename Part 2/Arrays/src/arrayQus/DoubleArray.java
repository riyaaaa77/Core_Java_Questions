package arrayQus;

public class DoubleArray {
	public static void main(String [] args)
	{
		int c = 0;
		// creating an array
		double [] arr = new double [5];
		
		//storing the values in the array
		arr[0] = 5.65;
		arr[1] = 9.322;
		arr[2] = 2.81;
		arr[3] = 8.33;
		arr[4] = 6.77;
		
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
