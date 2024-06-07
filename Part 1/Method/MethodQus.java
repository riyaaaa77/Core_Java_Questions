class MethodQus 
{
	public static void add(int a,int b)
	{
		int sum = a+b;
		int product = a*b;
		int final_add = sum+product;
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("Sum of sum of and product " + final_add);

	}
	public static void main(String [] args)
	{
		add(20,35);
	}
}