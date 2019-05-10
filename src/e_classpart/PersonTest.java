package e_classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person men = new Person();
		men.age = 40;
		men.name = "James";
		men.marri = true;
		men.children = 3;
		System.out.println("나이 : "+men.age);
		System.out.println("이름 : "+men.name);
		System.out.println("결혼여부 : "+men.marri);
		System.out.println("자녀 수 : "+men.children+"명");

	}

}
