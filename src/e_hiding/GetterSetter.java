package e_hiding;

class StudentOne {
	//���е� ������� --> ���� ��Ͼȿ����� ���ٰ���
	private String name;
	private int age;
	
	//���е� ��������� ���� �ִ¹�� --> �޼ҵ带 ���
	public void setName(String name) {//set�Լ� setter
		this.name = name;
	}
	//���е� ��������� ���� �д� ���
	public String getName() {//get�Լ� getter
		return name;
	}
	//set�� get�� ���� �������� ����� ���� ���� get���� ���´�.
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
		s.setName("�����Դϴ�.");
		s.setAge(17);
		
		String name = s.getName();
		System.out.println("�̸� : "+name);
		int age = s.getAge();
		System.out.println("���� :"+age);

	}

}
