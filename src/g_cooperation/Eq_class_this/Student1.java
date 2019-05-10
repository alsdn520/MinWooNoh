package g_cooperation.Eq_class_this;
//2. 생성자에서 다른 생성자를 호출할 때
public class Student1 {
	String name;
	char gender;

	Student1(){
		this("NoName", '?');//아래에 정의된 생성자 호출 
	}

	Student1(String name, char gender){
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
//이 코드는 인스턴스를 생성하면서 아무런 정보도 입력하지 않았을때의 default값을
//설정하기 위해 이미 정의된 다른 생성자를 사용하는 것이다.