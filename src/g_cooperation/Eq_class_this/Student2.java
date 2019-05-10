package g_cooperation.Eq_class_this;
//3. 자신의 주소 반환
public class Student2 {

	String name;
	char gender;
	
	public Student2 returnSelf() {
		return this;
	}//Student2 타입의 자료를 반환하는 함수라 반환형이 Student2인 메소드이다.
}
