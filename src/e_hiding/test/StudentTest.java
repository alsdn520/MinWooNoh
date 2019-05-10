package e_hiding.test;

import e_hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이상원"; 
		//이유 : 오류발생 접근제아자가 private라 접근할수 없다. 
		//즉, private에 바로 접근할 수 없기 떄문이다(외부에서 접근X).
		//studentLee.getStudentName(); get함수를 통해 접근해야한다.
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
		
	}

}
