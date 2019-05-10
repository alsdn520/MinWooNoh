package e_hiding;

class StudentOne {
	//은닉된 멤버변수 --> 현재 블록안에서만 접근가능
	private String name;
	private int age;
	
	//은닉된 멤버변수에 값을 넣는방법 --> 메소드를 사용
	public void setName(String name) {//set함수 setter
		this.name = name;
	}
	//은닉된 멤버변수의 값을 읽는 방법
	public String getName() {//get함수 getter
		return name;
	}
	//set과 get는 적는 순서에는 상관이 없다 보통 get부터 적는다.
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

public class GetterSetter {
	public static void main(String[] args) {
		StudentOne s = new StudentOne();
		s.setName("민코입니다.");
		s.setAge(17);
		
		String name = s.getName();
		System.out.println("이름 : "+name);
		int age = s.getAge();
		System.out.println("나이 :"+age);

	}

}
