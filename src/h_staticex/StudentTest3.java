package h_staticex;

public class StudentTest3 {
	public static void main(String[] agrs) {
		Student Lee = new Student();
		Lee.setStudentName("이지원");
		System.out.println(Student.serialNum);
		System.out.println(Lee.studentName+" 학번 "+Student.serialNum);
		
		Student Son = new Student();
		Son.setStudentName("손예진");
		System.out.println(Student.serialNum);
		System.out.println(Son.studentName+" 학번 "+Son.serialNum);
	}
}
