package h_staticex;
//Ŭ���� �޼���
public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}//������ �ʱ�ȭ
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSeriaNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSeriaNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
