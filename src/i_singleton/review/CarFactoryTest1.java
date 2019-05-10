package i_singleton.review;

import i_singleton.Car;
import i_singleton.CarFactory;

public class CarFactoryTest1 {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getCarFactory();//�̱�������
		Car mySonata = factory.createCar(); //�޼��忡�� Car����
		Car yourSonata = factory.createCar(); 
		
		System.out.println(mySonata.getCarNum()); //10001 ���
		System.out.println(yourSonata.getCarNum()); //10002 ���

	}

}
