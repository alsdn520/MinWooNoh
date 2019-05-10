package i_singleton.review;

import i_singleton.Car;
import i_singleton.CarFactory;

public class CarFactoryTest1 {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getCarFactory();//싱글톤패턴
		Car mySonata = factory.createCar(); //메서드에서 Car생성
		Car yourSonata = factory.createCar(); 
		
		System.out.println(mySonata.getCarNum()); //10001 출력
		System.out.println(yourSonata.getCarNum()); //10002 출력

	}

}
