/* p p p
   o o o
   n n n
   m m m */
   
class Q9
{
	public static void main(String [] args)
	{
		//for loop

		for(char c = 'p'; c >='m' ; c--)
		{
			for(int i = 1; i <=3; i++)
			{	
				System.out.print(c);
			}
		System.out.println();
		}
		
		//While loop

		char c1 = 'p';
		while(c1>='m')
		{
			int i1 =1;
			while(i1<=3)
			{
				System.out.print(c1);
				i1++;
			}
		c1--;
		System.out.println();
		}
		
		//do while loop

	}

}