package g_cooperation;

public class Student {
	
	public String studentName; //�л��̸�
	public int grade; //�г�
	public int money; //��
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}//�л� ������
	
	public void takeBus(Bus bus){
		bus.take(1000);//�л��� �����ϴ� �������
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}//����ö ���
	
	public void showInfo() {
		System.out.println(studentName+"�� ��������"+money+"�Դϴ�.");
	}//�л�����
}
