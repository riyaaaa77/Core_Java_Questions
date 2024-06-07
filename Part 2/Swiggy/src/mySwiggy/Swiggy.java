package mySwiggy;
import java.util.Scanner;
public class Swiggy {
	static Scanner sc = new Scanner(System.in);
	static String password;
	static String pass1;
	public static void main(String [] args)
	{
		int op;
		do {
		System.out.println("Welcome to my Swiggy Program");
		System.out.println("**********************************");
		System.out.println("Enter 1 : Login");
		System.out.println("Enter 2 : Signup");
		System.out.println("Enter 3 : Logout ");
		
		op = sc.nextInt();
		switch (op)
		{
		case 1:
			login();
			break;
		case 2:
			signup();
			break;
		case 3:
			System.out.println("Exiting the program!!!");
			System.out.println();
			break;
		case 4:
			System.out.println("Invalid input");
			break;
		}
		}while(op!=3);
		
		
	}
	
    public static void signup() {

        System.out.println("Enter your username: ");
        sc.nextLine();
        String name = sc.nextLine();
             
        System.out.println("Create your password:");
        password = sc.nextLine(); 
        
        System.out.println("Your username is " + name);
        System.out.println("Your password is " + password);
        System.out.println();
       
    }
    public static void login()
    {
   
    	System.out.println("Enter your user name");
    	sc.nextLine();
    	String name1 = sc.nextLine();
    	
    	System.out.println("Enter your password");
    	 pass1 = sc.nextLine();
    	 
    	 if (password.equals(pass1)) {
 	        System.out.println("Login successful!");
 	        System.out.println();
 	        menu();
 	    } 
 	 else {
 	        System.out.println("Invalid password");
 	       System.out.println();
 	 }
    
    	}
    
    public static void menu()
    {
    	int option;
		boolean b = true;
		while(b)
		{
			System.out.println("Enter the option what do you want to order in menu ");
			System.out.println("***************************************************");
			System.out.println("1. For Starters");
			System.out.println("2. For Combo Meals");
			System.out.println("3. For Roti");
			System.out.println("4. For Vegetables");
			System.out.println("5. For Soups");
			System.out.println("6. For Rice Preparation");
			System.out.println("7. For Deserts");
			System.out.println("8. For exit");
			
			option = sc.nextInt();
			
			switch (option)
			{
			case 1:
				starters(sc);
				break;
			case 2:
				comboMeals(sc);
				break;
			case 3:
				roti(sc);
				break;
			case 4:
				vegetables(sc);
				break;
			case 5:
				soups(sc);
				break;
			case 6:
				rice(sc);
				break;
			case 7:
				desert(sc);
				break;
			case 8:
				System.out.println("Thankyou for your orders !!! , Exiting from the orders");
				System.out.println();
				b = false;
				break;
			default :
				System.out.println("Invalid option");
			}
					
		}

    }
    public static void starters(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in Starter");
		System.out.println("******************************************************");
		int op;
		do {
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
				haraBharaKabab(sc);
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
				System.out.println("Order completed in starter!! ");
				System.out.println();
				break;
			default : 
				System.out.println("Invild input");		
			}
		
		}while(op!=9);
	}
    public static void comboMeals(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in Combo meals");
		System.out.println("******************************************************");
		int op1;
		do {
		System.out.println("1. Daal Dhokli  ------------------------- 130/- full plate");
		System.out.println("2. Puri Bhaji  ---------------------------120/- full plate");
		System.out.println("3. Rice sambhar  -------------------------160/- full plate");
		System.out.println("4. Shrikhand Poori  ----------------------170/- full plate");
		System.out.println("5. Pav Bhaji  ----------------------------160/- full plate");
		System.out.println("6. Chhole Bhature  -----------------------130/- full plate");
		
		System.out.println("7. exit");
		 
		op1 = sc.nextInt();
		switch (op1) {
		case 1:
			dalDhokli(sc);
			break;
		case 2:
			puriBhaji(sc);
			break;
		case 3 :
			riceSambhar(sc);
			break;
		case 4:
			srikhandPuri(sc);
			break;
		case 5 :
			paavBhaji(sc);
			break;
		case 6:
			chholeBhature( sc);
			break;
		case 7:
			System.out.println("Order completed in Combo meals!! ");
			System.out.println();
			break;
		default : 
			System.out.println("Invild input");		
		}
	
		 }while(op1!=7);
	}
	public static void roti(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in roti");
		System.out.println("******************************************************");
		int op2;
		do {
		System.out.println("1. Tandoori roti  --------------------------- 130/- full plate");
		System.out.println("2. Kulcha dry---------------------------------120/- full plate");
		System.out.println("3. Masala kulcha -----------------------------160/- full plate");
		System.out.println("4. Chilli garlic naan ------------------------170/- full plate");
		System.out.println("5. Cheese naan--------------------------------160/- full plate");
		System.out.println("6. Paratha------------------------------------130/- full plate");
		System.out.println("7. Butter Paratha ----------------------------150/- full plate");
		System.out.println("8. Tava chapati-------------------------------120/- full plate");
		System.out.println("9.Puris (6 pcs) -----------------------------130/- full plate");
		System.out.println("10.Papad -------------------------------------160/- full plate");
		System.out.println("11.Masala papad -------------------------------130/- full plate");
		System.out.println("12.Butter tandoori roti ----------------------180/- full plate");
		
		System.out.println("13. exit");
	
		op2 = sc.nextInt();
		switch (op2) {
		case 1:
			tandooriRoti(sc);
			break;
		case 2:
			kulchaDry(sc);
			break;
		case 3 :
			masalaKulcha(sc);
			break;
		case 4:
			chilliGarlicNaan(sc);
			break;
		case 5 :
			cheeseNaan(sc);
			break;
		case 6:
			paratha(sc);
			break;
		case 7:
			butterParatha(sc);
			break;
		case 8 :
			tavaChapati(sc);
			break;
		case 9:
			puris(sc);
			break;
		case 10:
			papad(sc);
			break;
		case 11:
			masalaPapad(sc);
			break;
		case 12 :
			butterTandooriRoti(sc);
			break;
		case 13:
			System.out.println("Order completed in Roti dishes!! ");
			System.out.println();
			break;
		default : 
			System.out.println("Invild input");		
		}

		 }while(op2!=14);
		
	}
	public static void vegetables(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in vegetables");
		System.out.println("******************************************************");
		int op3;
		do {
		System.out.println("1. Jeera aloo/ aloo mutter  --------------------------- 130/- full plate");
		System.out.println("2. Bhindi masala----------------------------------------120/- full plate");
		System.out.println("3. Paneer Palak-----------------------------------------160/- full plate");
		System.out.println("4. Kadai aloo-------------------------------------------370/- full plate");
		System.out.println("5. Paneer chhole----------------------------------------160/- full plate");
		System.out.println("7. Kadai vegetables-------------------------------------130/- full plate");
		System.out.println("8. Veg jaipuri------------------------------------------150/- full plate");
		System.out.println("9. Kaju vegetable muter---------------------------------420/- full plate");
		System.out.println("10.Malai kofta------------------------------------------130/- full plate");
		System.out.println("11.Dum aloo kashmiri------------------------------------160/- full plate");
		System.out.println("12.Paneer makhani---------------------------------------130/- full plate");
		System.out.println("13.Paneer kofta-----------------------------------------380/- full plate");
		System.out.println("14.Green kabab masal------------------------------------180/- full plate");
		System.out.println("15.Paneer Lazeez----------------------------------------180/- full plate");
		System.out.println("16.Dal Surti--------------------------------------------180/- full plate");
		System.out.println("17.Dahi kadhi-------------------------------------------280/- full plate");
		System.out.println("18.Dal tadka--------------------------------------------180/- full plate");
		System.out.println("19.Veg makhanawal---------------------------------------120/- full plate");
		System.out.println("20.Chana masala-----------------------------------------450/- full plate");
		System.out.println("21.Mushroom fries---------------------------------------290/- full plate");
		System.out.println("22. exit");
	
		op3 = sc.nextInt();
		 
		 }while(op3!=22);
	}

	public static void soups(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in Soups");
		System.out.println("******************************************************");
		int op4;
		do {
		System.out.println("1. Sweet corn plane  --------------------------------- 130/- full plate");
		System.out.println("2. Sweet corn vegetable--------------------------------120/- full plate");
		System.out.println("3. Palak-----------------------------------------------160/- full plate");
		System.out.println("4. Lemon corander -------------------------------------170/- full plate");
		System.out.println("5. exit");
		 
		op4 = sc.nextInt();
		 
		 }while(op4!=5);
	}

	public static void rice(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in rice preparation");
		System.out.println("******************************************************");
		int op5;
		do {
		System.out.println("1. Plain Rice ---------------------------------------- 130/- full plate");
		System.out.println("2. Jeera Rice -----------------------------------------120/- full plate");
		System.out.println("3. Khichadi with Kadhi --------------------------------160/- full plate");
		System.out.println("4. Dal Khichadi ---------------------------------------170/- full plate");
		System.out.println("5. Vegetable biryani ----------------------------------160/- full plate");
		System.out.println("6. Polav  ---------------------------------------------130/- full plate");
		
		System.out.println("7. exit");
		 
		op5 = sc.nextInt();
	
		 }while(op5!=7);
	}

	public static void desert(Scanner sc)
	{
		System.out.println("enter the option what do you want to order in Deserts");
		System.out.println("******************************************************");
		int op6;
		do {
		System.out.println("1.Gulab Jamun (2 pcs)  ------------------------------ 130/- full plate");
		System.out.println("2. Shrikhand------------------------------------------120/- full plate");
		System.out.println("3. Gajar ka hlwa--------------------------------------160/- full plate");
		System.out.println("4. exit");
		 
		op6 = sc.nextInt();
		 
		 }while(op6!=4);
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
	public static void dalDhokli(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Dal Dhokli * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void puriBhaji(Scanner sc)
	{
		int i = 120;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Puri Bhaji * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void riceSambhar(Scanner sc)
	{
		int i = 160;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Rice Sambhar * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void srikhandPuri(Scanner sc)
	{
		int i = 170;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Srikhand Puri * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void paavBhaji(Scanner sc)
	{
		int i = 160;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Paav Bhaji * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void chholeBhature(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Chhole Bhature * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void tandooriRoti(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Tandoori Roti * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void kulchaDry(Scanner sc)
	{
		int i = 120;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Kulcha Dry * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void masalaKulcha(Scanner sc)
	{
		int i = 160;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Masala kulcha * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void chilliGarlicNaan(Scanner sc)
	{
		int i = 170;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Chilli Garlic Naan * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void cheeseNaan(Scanner sc)
	{
		int i = 160;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println(" Cheese Naan * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void paratha(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Paratha * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void butterParatha(Scanner sc)
	{
		int i = 150;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Butter Paratha * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void tavaChapati(Scanner sc)
	{
		int i = 120;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Tava chapati * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void puris(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Puris * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void papad(Scanner sc)
	{
		int i = 160;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Papad * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	
	public static void masalaPapad(Scanner sc)
	{
		int i = 130;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Masala Papad * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	public static void butterTandooriRoti(Scanner sc)
	{
		int i = 180;
		System.out.println("How much ammount you need ");
		int am = sc.nextInt();
		System.out.println("Butter Tandoori Roti * " +  am );
		System.out.println("Total payable amount is: " + i*am + "/-");
		System.out.println();
	}
	
	
}
	