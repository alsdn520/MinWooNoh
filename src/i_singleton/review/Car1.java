package i_singleton.review;
//�ڵ��� ��ȣ�� �ڵ����� �ֱ����� class
public class Car1 {
	
	int carNum;
	private static int num = 10000;
	
	
	public Car1() { //�ڵ��� ��ü�� ���涧 ���� 1�� ����.
		num++;
		carNum = num;//�ڵ��� ��ȣ�� carNum���� �Ѱ���.
	}
	
	public int getCarNum() { //static ���� ����� num�� ������ ������������
		return num;
	}
	
	public void setCarNum() { //num�� ������ �޾ƿ������� 
		this.carNum = num; //num�� �ּҸ� carNum�� ���� ����Ŵ
	}
}
