package FinalExample;

public class Student
{
	private int sid;
	private String sname;
	private final long aadhar;
	public Student(int sid, String sname, long aadhar)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname+ ", aadhar=" + aadhar + "]";
	}
       
}
