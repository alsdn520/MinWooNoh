package g_cooperation;

public class Bus {
	int busNaumber;  //������ȣ
	int passgerCount;//�°� ��
	int money;       //���� ����
	
	public Bus(int busNaumber) {
		this.busNaumber = busNaumber;
	}//���� ��ȣ�� �Ű������� �޴� ������
	
	public void take(int money) {
		this.money = money;
		passgerCount++;
	}//�°��� ������ ź ��츦 ����
	
	public void showInfo() {
		System.out.println("����" + busNaumber + "�����°���"+passgerCount+"���̰� ������"+money+"�Դϴ�." );
	}
}
