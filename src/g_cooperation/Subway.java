package g_cooperation;

public class Subway {
	String lineNumber;//����ö �뼱
	int passengerCont;//�°���
	int money;
	
	public Subway(String lineNuber) {
		this.lineNumber = lineNuber;
	}//����ö �뼱�� �Ű������� �޴� ������.
	
	
	public void take(int money) {//�°��� ����ö�� ź���
		this.money = money;
		passengerCont++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"�� �°���"+passengerCont+"���̸�, ������"+money+"�Դϴ�.");
	}
}
