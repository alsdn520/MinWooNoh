package h_staticex;

public class StudentTest3 {
	public static void main(String[] agrs) {
		Student Lee = new Student();
		Lee.setStudentName("������");
		System.out.println(Student.serialNum);
		System.out.println(Lee.studentName+" �й� "+Student.serialNum);
		
		Student Son = new Student();
		Son.setStudentName("�տ���");
		System.out.println(Student.serialNum);
		System.out.println(Son.studentName+" �й� "+Son.serialNum);
	}
}
