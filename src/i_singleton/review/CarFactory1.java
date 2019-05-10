package i_singleton.review;

public class CarFactory1 {
	private static CarFactory1 instance = new CarFactory1();//�̱��� ���� �ν��Ͻ� ����
	private CarFactory1() {} //public -> private�� �⺻ ������ ���� 
	
	public static CarFactory1 getCarFatory() {//private�� ����� instance(�ν��Ͻ��� ��������)
		
		if(instance == null) {
			instance = new CarFactory1();
		}//Ȥ�ó� instance�� null���� �������� ����
		
		return instance;
	}
	
	public Car1 createCar() {
		Car1 carNum = new Car1();
		
		return carNum;
	}
	
}
