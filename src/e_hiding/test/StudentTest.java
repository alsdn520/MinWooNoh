package e_hiding.test;

import e_hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��"; 
		//���� : �����߻� ���������ڰ� private�� �����Ҽ� ����. 
		//��, private�� �ٷ� ������ �� ���� �����̴�(�ܺο��� ����X).
		//studentLee.getStudentName(); get�Լ��� ���� �����ؾ��Ѵ�.
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
		
	}

}
