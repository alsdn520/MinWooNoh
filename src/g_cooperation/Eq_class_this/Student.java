package g_cooperation.Eq_class_this;
//1. �ν��Ͻ��� ����� �޸��� �ּ�
public class Student {
	String name;
	char gender;

	public void setName(String name) {
		this.name = name; //this.name�� Ŭ������ ��������̰� 
		//name�� �޼ҵ��� �Ű������� �ǹ��Ѵ�.
	}
	public String getName() {
		return this.name;//Ŭ���� ��������� name�� ��ȯ.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

