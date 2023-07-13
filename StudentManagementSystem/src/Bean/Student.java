package Bean;

public class Student {

	private int sRoll;
	private String sName;
	private String mobile;
	private String password;
	private String courseName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sRoll, String sName, String mobile, String password, String courseName) {
		super();
		this.sRoll = sRoll;
		this.sName = sName;
		this.mobile = mobile;
		this.password = password;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [sRoll=" + sRoll + ", sName=" + sName + ", mobile=" + mobile + ", password=" + password
				+ ", courseName=" + courseName + "]";
	}
	
	
}
