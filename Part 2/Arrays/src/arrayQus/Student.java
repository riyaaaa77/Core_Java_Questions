package arrayQus;

public class Student {
	public static void main(String [] args)
	{
		int c = 0;
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		
		Student [] s = new Student[6];
		s[0] = s1;
		s[1] = s3;
		s[2] = s6;
		s[3] = s2;
		s[4] = s4;
		s[5] = s5;
			
		System.out.println("Refrenece address of the array : " + s);
		for(int i = 0; i<s.length ; i++)
		{
			c++;
		}
		System.out.println("Number of elements present in array : " + c);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		
		for(int j = 0; j<s.length; j++)
		{
			System.out.print(s[j] + " ");
		}
		System.out.println();
		for(int k = s.length-1; k>=0; k--)
		{
			System.out.print(s[k] + " ");
		}
		
	}
}
