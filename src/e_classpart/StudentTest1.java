package e_classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();//student Ŭ������ �ν��Ͻ�ȭ, student1(��������) �л� ���� 
		student1.studentName = "�ȿ���";//������� ���
		System.out.println(student1.getStudentName());//�޼��� ���
		System.out.println(student1);//���������� ���
		Student student2 = new Student();//student2 �л� ���� 
		student2.studentName = "�Ƚ¿�";
		System.out.println(student2.getStudentName());
		
	}

}
