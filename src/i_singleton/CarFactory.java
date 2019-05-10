package i_singleton;

public class CarFactory {
	
	private static CarFactory factory = new CarFactory();
	
	private CarFactory() {}
	public static CarFactory getCarFactory() {
		if(factory == null) {
			factory = new CarFactory();
		}
		
		return factory;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
