package h_staticex;

public class STudenterTest {

	public static void main(String[] args) {
		Student stLee = new Student();
		stLee.setStudentName("이지원");
		System.out.println(stLee.serialNum);
		System.out.println(stLee.studentName+" 학번 :"+ stLee.studentID );
		
		Student stSon = new Student();
		stSon.setStudentName("손순자");
		System.out.println(stSon.serialNum);
		System.out.println(stSon.studentName +" 학번 :" + stSon.studentID);
	}

}
