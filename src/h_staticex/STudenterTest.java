package h_staticex;

public class STudenterTest {

	public static void main(String[] args) {
		Student stLee = new Student();
		stLee.setStudentName("������");
		System.out.println(stLee.serialNum);
		System.out.println(stLee.studentName+" �й� :"+ stLee.studentID );
		
		Student stSon = new Student();
		stSon.setStudentName("�ռ���");
		System.out.println(stSon.serialNum);
		System.out.println(stSon.studentName +" �й� :" + stSon.studentID);
	}

}
