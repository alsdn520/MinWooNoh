package i_singleton.review;

public class CarFactory1 {
	private static CarFactory1 instance = new CarFactory1();//싱글톤 패턴 인스턴스 생성
	private CarFactory1() {} //public -> private로 기본 생성자 생성 
	
	public static CarFactory1 getCarFatory() {//private로 선언된 instance(인스턴스를 쓰기위해)
		
		if(instance == null) {
			instance = new CarFactory1();
		}//혹시나 instance가 null값을 가질떄를 위해
		
		return instance;
	}
	
	public Car1 createCar() {
		Car1 carNum = new Car1();
		
		return carNum;
	}
	
}
