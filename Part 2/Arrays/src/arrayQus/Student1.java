package arrayQus;

public class Student1 {
	String name;
	int roll;
	long phone_no;
	
	Student1(String name , int roll , long phone_no )
	{
		this.name = name;
		this.roll = roll;
		this.phone_no = phone_no;	
	}
	
	public static void main(String [] args)
	{
		Student1 s1 = new Student1("riya", 101 , 7290890673l );
		Student1 s2 = new Student1("shivani" , 102 , 6574839926l);
		Student1 s3 = new Student1("anjali" , 103 , 9999888876l);
		Student1 s4 = new Student1("anshuli" , 104 , 9945454566l);
		Student1 s5 = new Student1("preeti" , 105 , 6867847377l);
		
		Student1 [] s = {s1, s2 ,s3, s4, s5};

		System.out.println(s[0].name);
		System.out.println(s[0].roll);
		System.out.println(s[0].phone_no);
		System.out.println(s[1].name);
		System.out.println(s[1].roll);
		System.out.println(s[1].phone_no);
		System.out.println(s[2].name);
		System.out.println(s[2].roll);
		System.out.println(s[2].phone_no);
		System.out.println(s[4].name);
		System.out.println(s[3].roll);
	}
}
