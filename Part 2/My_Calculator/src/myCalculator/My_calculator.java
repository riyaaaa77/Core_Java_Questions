package myCalculator;
import java.util.Scanner;
public class My_calculator {
	public static void main(String [] args)
	{
		System.out.println("Welcome to my program");
		System.out.println("*******************************");
		Scanner sc = new Scanner(System.in);
		int i;
		do
		{
			System.out.println("Enter the option");
			System.out.println("1 : For Addition");
			System.out.println("2 : For Subtraction");
			System.out.println("3 : For Multiplocation");
			System.out.println("4 : For Division");
			System.out.println("5 : For Operation");
			System.out.println("6 : Exit");
			
			i = sc.nextInt();
		
			switch (i)
			{
				case 1:
					add(sc);
					break;
				case 2:
					subs(sc);
					break;
				case 3: 
					muls(sc);
					break;
				case 4:
					divs(sc);
					break;
				case 5:
					ops(sc);
					break;
				case 6:
					System.out.println("Thankyou for using my program");
					break;
				default:
					System.out.println("Invalid option");
			
			
			}
			
		}while(i != 6);
		sc.close();
		
	}
	public static void add(Scanner sc)
	{
		System.out.println("Enter the number 1:");
		int a = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Addition of two num is " + sum);
		System.out.println();
		
	}
	public static void subs(Scanner sc)
	{
		System.out.println("Enter the number 1:");
		int a1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b1 = sc.nextInt();
		
		int sub = a1-b1;
		System.out.println("Subtraction of two num is " + sub);
		System.out.println();
	}
	public static void muls(Scanner sc)
	{
		System.out.println("Enter the number 1:");
		int a2 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b2 = sc.nextInt();
		
		int mul = a2*b2;
		System.out.println("Multiplication of two num is " + mul);
		System.out.println();
	}
	public static void divs(Scanner sc )
	{
		System.out.println("Enter the number 1:");
		int a3 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b3 = sc.nextInt();
		
		int div = a3/b3;
		System.out.println("Division of two num is " + div);
		System.out.println();
	}
	public static void ops(Scanner sc)
	{
		int j;
		do
		{
			System.out.println("Enter the operations to perform");
			System.out.println("--------------------------------");
			System.out.println("1. To count the digits");
			System.out.println("2. To find the square");
			System.out.println("3. To find Cube");
			System.out.println("4. To find factorial");
			System.out.println("5. To find factors");
			System.out.println("6. To find the power");
			System.out.println("7. To exit ");
			
			j = sc.nextInt();
			switch (j)
			{
			case 1: 
				count(sc);
				break;
			case 2:
				sq(sc);
				break;
			case 3:
				cube(sc);
				break;
			case 4:
				facto(sc);
				break;
			case 5 :
				fact(sc);
				break;
			case 6:
				pwr(sc);
				break;
			case 7 :
				System.out.println("Exiting the loop");
				break;
			default : 
				System.out.println("Invalid opions");
			}
			
			
		}while(j!=7);
	}
	public static void count(Scanner sc)
	{
		System.out.println("Enter the num");
		int k = sc.nextInt();
		int c=0;
		
		while(k>0)
		{
			int rem = k%10;
			c++;
			k/=10;
		}System.out.println("the count of digits is:" + c);
		System.out.println();
	}
	public static void sq(Scanner sc)
	{
		System.out.println("Enter the num");
		int s = sc.nextInt();
		int s1 = s*s;
		System.out.println("The square of the num is:" + s1);
		System.out.println();
	}
	public static void cube(Scanner sc)
	{
		System.out.println("Enter the num");
		int c1 = sc.nextInt();
		int c = c1*c1*c1;
		System.out.println("The cube of the num is :"+ c);
		System.out.println();
	}
	public static void facto(Scanner sc)
	{
		System.out.println("Enter the num");
		int f1 = sc.nextInt();
		int f = 1;
		for(int i = 1; i<=f1; i++)
		{
			f = f*i;
		}System.out.println("the fectorial of the num is :" + f);
		System.out.println();
	}
	public static void fact(Scanner sc)
	{
		System.out.println("Enter the num");
		int l = sc.nextInt();
		System.out.println("The factors are: ");
		for(int i =1; i<=l; i++)
		{
			if(l%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void pwr(Scanner sc)
	{
		System.out.println("Enter the power");
		int p = sc.nextInt();
		System.out.println("Enter the base");
		int b = sc.nextInt();
		
		int pw =1;
		while(p>0)
		{
			pw *=b;
			p--;
		}
		System.out.println("The power of the num is: "+ pw);
		System.out.println();
	
	}
}
