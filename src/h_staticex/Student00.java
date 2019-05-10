package h_staticex;

public class Student00 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNumber;
	
	public Student00(){
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
		//studentName = "aaa";   //¿À·ù ³²
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student00.serialNum = serialNum;
	}
}

