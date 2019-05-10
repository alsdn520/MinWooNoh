package g_cooperation.Eq_class_this;
//1. 인스턴스가 저장된 메모리의 주소
public class Student {
	String name;
	char gender;

	public void setName(String name) {
		this.name = name; //this.name은 클래스의 멤버변수이고 
		//name은 메소드의 매개변수를 의미한다.
	}
	public String getName() {
		return this.name;//클래스 멤버변수의 name를 반환.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

