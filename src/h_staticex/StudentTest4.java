package h_staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 st2 = new Student2();
		st2.setStudentName("������");
		System.out.println(st2.studentName);
		System.out.println(Student2.getSeriaNum());
		System.out.println(st2.studentName+" �й� "+st2.studentID);
		
		Student2 st3 = new Student2();
		st3.setStudentName("�տ���");
		System.out.println(st3.studentName);
		System.out.println(Student2.getSeriaNum());
		System.out.println(st3.studentName+" �й� "+st3.studentID);
		
		

	}

}
