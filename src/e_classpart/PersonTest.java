package e_classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person men = new Person();
		men.age = 40;
		men.name = "James";
		men.marri = true;
		men.children = 3;
		System.out.println("���� : "+men.age);
		System.out.println("�̸� : "+men.name);
		System.out.println("��ȥ���� : "+men.marri);
		System.out.println("�ڳ� �� : "+men.children+"��");

	}

}
