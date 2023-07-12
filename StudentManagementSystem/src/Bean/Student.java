package Bean;

public class Student {

	private int sRoll;
	private String sName;
	private String courseName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sRoll, String sName, String courseName) {
		super();
		this.sRoll = sRoll;
		this.sName = sName;
		this.courseName = courseName;
	}
	
	public int getsRoll() {
		return sRoll;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return "Student [sRoll=" + sRoll + ", sName=" + sName + ", courseName=" + courseName + "]";
	}
	
	
}
