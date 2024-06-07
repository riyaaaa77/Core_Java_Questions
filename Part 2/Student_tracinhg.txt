class Student
{
	String name;
	int roll;
	static String cname = "jsp";

	Student(String n)
	{
		//name = n;
		System.out.println("Account is created and name is updated");
	}
	Student (String n, int r)
	{
		System.out.println("Account is created and name and roll is updated");
	}	
	Student(int r)
	{
		//roll = r;
		System.out.println("Account is created and roll is updated ");
	}
	Student()
	{
		System.out.println("Account is created and data is not updated");
	}
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(roll);
	}
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.printdetails();
		Student s2 = new Student(5);
		s1.printdetails();
		Student s3 = new Student("Dev",5);
		s3.printdetails();
		Student s4 = new Student("Devi",50);
		s4.printdetails();
		Student s5 = new Student("Devilal");
		s5.printdetails();

	}
}