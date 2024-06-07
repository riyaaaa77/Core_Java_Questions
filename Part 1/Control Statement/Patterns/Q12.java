/* IHG
   FED
   CBA */
   
class Q12
{
	public static void main(String [] args)
	{
		//for loop
		char c = 'I';
		for(int i = 1;i<=3;i++)
		{
			for(int a = 1; a <=3; a++)
			{	
				System.out.print(c);
				c--;
			}
		System.out.println();
		}
		
		//While loop
		char c1 = 'I';
		int i1 = 1;
		while(i1<=3)
		{
			int a1 = 1;
			while(a1<=3)
			{
				System.out.print(c1);
				a1++;
				c1--;
			}
		i1++;
		System.out.println();
		}
		
		//do while loop

	}

}