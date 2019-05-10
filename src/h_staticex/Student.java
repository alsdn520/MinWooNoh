package h_staticex;

public class Student {
	public static int serialNum = 1000; //static변수는 인스턴스(객체)와 상관없이 먼저 생성됨.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}
