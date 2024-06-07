package encapsulation;

public class Student {
	private String name;
	private long phno;
	private int roll_no;
	private int mark;
	private String college_name;
	private long aadhar_no;

	public Student(String name, long phno, int roll_no, int mark, String college_name, long aadhar_no) {
		this.name = name;
		this.phno = phno;
		this.roll_no = roll_no;
		this.mark = mark;
		this.college_name = college_name;
		this.aadhar_no = aadhar_no;
	}
	public String getName() {
		return name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getCollege_name() {
		return college_name;
	}
	
	
}
