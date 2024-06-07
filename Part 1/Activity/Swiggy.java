public static void details(Scanner sc)
	{
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your phone number:");
		long phone_no = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your address:");
		String address = sc.nextLine();
		System.out.println("Congrats! "+ name +"Your order has been confired, for this address" + address);	
		
	}