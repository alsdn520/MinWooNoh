package g_cooperation.Eq_class_this;

public class Test {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Jun");
		
		//1 get�޼ҵ� ���
		System.out.println(st.getName());
		//2 �������� ���
		System.out.println(st);
		//3 �޼��� ȣ��
		st.printThis();
		
//setName�� �Ű������� ���޵� "Jun"�� ���� �Ǿ���.
//�� �� setName �޼ҵ��� �ڵ� �������� this�� �ν��Ͻ��� ���ԵǴ°��̴�.
//���� �ڵ� �����δ� st.name = "Jon" �� �Ǵ°��̴�.

//stu�� ����ϰ� this�� ����ϴ� PrintThis() �޼ҵ带 ȣ���� ����� ����.
//1,3���� �ν��Ͻ��� ����� �� �޸𸮿� �ּҰ��� ������ �����̴�.


	}

}
