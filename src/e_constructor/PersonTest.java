package e_constructor;

public class PersonTest {	
	
	public static void main(String[] args) {
		//����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		Person personNo = new Person(); // PersonŬ������ ����Ʈ�����ڰ� ������ ����������.
		personNo.name = "��ο�";
		personNo.height = 181.2f;
		personNo.weight = 78.0f;
		
		//�ν���Ʈ ���� �ʱ���Ͽ� ���ÿ� Ŭ���� ����
		Person personLee = new Person("�̼���",175,75);
		
		System.out.println(personNo);//�ּҰ�(�ؽ��ڵ�)�� ����Ŵ
		System.out.println(personLee);//�ּҰ�(�ؽ��ڵ�)�� ����Ŵ
		
		System.out.println(personNo.name);
		System.out.println(personLee.name);
	}

}
