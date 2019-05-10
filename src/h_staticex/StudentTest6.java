package h_staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student6 st1 = new Student6();
		st1.setStudentName("토리");


		System.out.println(st1.name+"의 학번은 : "+st1.studentID+
				" 이고, 카드번호는 :"+st1.cade+" 이다.");
		
		Student6 st2 = new Student6();
		st2.setStudentName("뽀삐");
		
		System.out.println(st2.name+"의 학번은 : "+st2.studentID+
				" 이고, 카드번호는 :"+st2.cade+" 이다.");
		

	}

}
