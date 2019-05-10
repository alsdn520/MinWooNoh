package h_staticex;

public class Student6 {
	
	private static int seriaNum = 1000;
	private static int cadeNum = 100;
	String name;
	int studentID;
	int cade;
	
	public Student6() {
		seriaNum++;
		studentID = seriaNum;
		
		cadeNum = seriaNum + 100;
		cade =  cadeNum;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name = name;
	}
	
	public static int getSeriaNum() {
		return seriaNum;
	}
	public static void setSeriaNum(int seriaNum) {
		Student6.seriaNum = seriaNum;
	}
	
	public static int getCade() {
		return cadeNum;
	}
	public static void setCade(int cade) {
		
		Student6.cadeNum = cade;
	}

}
