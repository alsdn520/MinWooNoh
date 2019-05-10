package i_singleton.review;

import i_singleton.Car;
import i_singleton.CarFactory;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getCarFactory();//ΩÃ±€≈Ê∆–≈œ
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
