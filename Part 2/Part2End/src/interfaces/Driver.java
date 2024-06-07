package interfaces;
import java.util.Scanner;
public class Driver extends Calculator 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Welcome to my program");
		System.out.println("*******************************");
		int i;
		do
		{
			System.out.println("Enter the option : ");
			System.out.println("Enter 1 - For Addition");
			System.out.println("Enter 2 - For Subtraction");
			System.out.println("Enter 3 - For Multiplication");
			System.out.println("Enter 4 - For Division");
			System.out.println("Enter 5 - For other Operation");
			System.out.println("Enter 6 - To Exit");
			
			i = sc.nextInt();
			
			switch (i)
			{
				case 1:
					
					break;
				case 2:r
					
					break;
				case 3: 
					
					break;
				case 4:
					
				case 5:
					
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
	public static void addition()
	{
		System.out.println("Enter the option to add : ");
		System.out.println("Enter 1 - for adding two numbers ");
		System.out.println("Enter 2 - for adding three numbers ");
		System.out.println("Enter 3 - To exit ");
		
		int i = sc.nextInt();
		switch (i)
		{
		case 1 :
			
			break;
		case 2:
			
			break;
		case 3:
			System.out.println("Exiting from addition ");
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}
