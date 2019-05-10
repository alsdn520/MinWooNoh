package e_classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();//student 클래스의 인스턴스화, student1(참조변수) 학생 생성 
		student1.studentName = "안연수";//멤버변수 사용
		System.out.println(student1.getStudentName());//메서드 사용
		System.out.println(student1);//참조변수값 출력
		Student student2 = new Student();//student2 학생 생성 
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		
	}

}
