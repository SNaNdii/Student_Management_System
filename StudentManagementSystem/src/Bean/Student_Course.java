package Bean;

public class Student_Course {

	private int roll;
	private int cid;
	public Student_Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student_Course(int roll, int cid) {
		super();
		this.roll = roll;
		this.cid = cid;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Student_Course [roll=" + roll + ", cid=" + cid + "]";
	}
	
}
