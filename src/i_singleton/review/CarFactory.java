package i_singleton.review;

public class CarFactory {
	private static CarFactory car = new CarFactory();//유일하게 생성된 인스턴스
	private CarFactory() {} //private로 선언하여 외부에서 이 인스턴스에 접근하지 못하도록 제어해야 인스턴스 오류를 방지할 수 있다.
	
	public static CarFactory getCar() { 
		//private에 접근하기 위한 getter메서드
		// static 메소드로 선언한 이유는 인스턴스가 만들어지기 전부터 사용할 수 있어야 하기 때문
		if(car == null) {
			car = new CarFactory(); 
		}//인스턴스가 null이라면 new 를 생성
		return car;//유일하게 생성한 인스턴스 반환
	}
	
	public Car createCar() {
		// create메서드로 클래스타입 객체 만들어서 
		//car로 참조시킨다음 car를 리턴해서 객체를 얻는다.
		Car car2 = new Car();
		return car2;
	}

}
