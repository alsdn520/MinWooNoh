package g_cooperation.Eq_class_this;
//2. �����ڿ��� �ٸ� �����ڸ� ȣ���� ��
public class Student1 {
	String name;
	char gender;

	Student1(){
		this("NoName", '?');//�Ʒ��� ���ǵ� ������ ȣ�� 
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
//�� �ڵ�� �ν��Ͻ��� �����ϸ鼭 �ƹ��� ������ �Է����� �ʾ������� default����
//�����ϱ� ���� �̹� ���ǵ� �ٸ� �����ڸ� ����ϴ� ���̴�.