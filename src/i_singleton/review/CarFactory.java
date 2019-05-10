package i_singleton.review;

public class CarFactory {
	private static CarFactory car = new CarFactory();//�����ϰ� ������ �ν��Ͻ�
	private CarFactory() {} //private�� �����Ͽ� �ܺο��� �� �ν��Ͻ��� �������� ���ϵ��� �����ؾ� �ν��Ͻ� ������ ������ �� �ִ�.
	
	public static CarFactory getCar() { 
		//private�� �����ϱ� ���� getter�޼���
		// static �޼ҵ�� ������ ������ �ν��Ͻ��� ��������� ������ ����� �� �־�� �ϱ� ����
		if(car == null) {
			car = new CarFactory(); 
		}//�ν��Ͻ��� null�̶�� new �� ����
		return car;//�����ϰ� ������ �ν��Ͻ� ��ȯ
	}
	
	public Car createCar() {
		// create�޼���� Ŭ����Ÿ�� ��ü ���� 
		//car�� ������Ų���� car�� �����ؼ� ��ü�� ��´�.
		Car car2 = new Car();
		return car2;
	}

}
