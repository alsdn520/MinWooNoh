package g_cooperation.Ex03_Student;

public class Bus {
	int busNum;			//���� ��ȣ
	int passengerCount; //�°���
	int money; 			//���� ��
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) { //���� Ÿ�»���� �� ����
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����"+busNum+"���� �°��� "+passengerCount+"���̰�, ������"+money+"�Դϴ�.");
	}
}
