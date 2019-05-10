package h_staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++; //static값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
		
	}

}
