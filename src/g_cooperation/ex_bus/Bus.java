package g_cooperation.ex_bus;

public class Bus {
	int busNum;    //���� ��ȣ
	int intake = 0;    //����Ÿ�� ����
	int passenger; //�°���
	
	public Bus(int num) {
		this.busNum = num;
	}
	
	public void take(int passenger) {
		this.passenger++;
		this.intake += 1000;
	}
	
	public int getBusNum() {
		return busNum;
	}
	
	public int getIntake() {
		return intake;
	}
	public int getPassenger() {
		return passenger;
	}
	public void showInfo() {
		System.out.println("Bus "+this.getBusNum()+" got "
	+this.getPassenger()+" passengers and earned "+ this.getIntake()+" won ");
		//Bus 100 got 1 passengers and earned 1000 won
		//100�� ������ �°�1�� �׸��� 1000���� �����.
	}
}
