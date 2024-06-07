package practice;
import java.util.Scanner;

public class Practice 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option what do you want to order in Starter");
		System.out.println("******************************************************");
		int op;
		do 
		{
			System.out.println("1. Idli  ------------------------- 30/- per peice");
			System.out.println("2. Mini punjabi Samosa  -----------20/- per peice");
			System.out.println("3. Moong daal kachori  ------------60/- full plate");
			System.out.println("4. Hara bhara kabab  --------------70/- full plate");
			System.out.println("5. Mix Farsan  --------------------60/- full plate");
			System.out.println("6. cheese balls  ------------------20/- per peice");
			System.out.println("7. Paneer Tikka  ------------------70/- full plate");
			System.out.println("8. Paneer chilli  -----------------80/- full plate");
			System.out.println("9. exit");
		 
			op = sc.nextInt();
			switch (op) {
			case 1:
				idli(sc);
				break;
			case 2:
				miniSamosa(sc);
				break;
			case 3 :
				moongDal(sc);
				break;
			case 4:
				haraBharaKabab( sc);
				break;
			case 5 :
				mixFarsan(sc);
				break;
			case 6:
				cheeseBalls(sc);
				break;
			case 7:
				paneerTikka(sc);
				break;
			case 8:
				paneerChilli(sc);
				break;
			case 9:
				System.out.println("Order completed!!");
				break;
			default : 
				System.out.println("Invild input");		
			}
		}while(op!=9);
	}
	public static void idli(Scanner sc)
	{
		int i = 30;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Idli * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void miniSamosa(Scanner sc)
	{
		int i = 20;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Mini Punjab Samosa * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void moongDal(Scanner sc)
	{
		int i = 60;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Moong Dal Kachori * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void haraBharaKabab(Scanner sc)
	{
		int i = 70;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Hara Bhara Kabab * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void mixFarsan(Scanner sc)
	{
		int i = 60;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Mix Farsan * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void cheeseBalls(Scanner sc)
	{
		int i = 20;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Cheese balls * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void paneerTikka(Scanner sc)
	{
		int i = 70;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Paneer Tikka * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void paneerChilli(Scanner sc)
	{
		int i = 80;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Paneer Chilli * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
} 

    
	


