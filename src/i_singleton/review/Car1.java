package i_singleton.review;
//자동차 번호를 자동으로 주기위한 class
public class Car1 {
	
	int carNum;
	private static int num = 10000;
	
	
	public Car1() { //자동차 객체가 생길때 마다 1씩 증가.
		num++;
		carNum = num;//자동차 번호를 carNum으로 넘겨줌.
	}
	
	public int getCarNum() { //static 으로 선언된 num의 정보를 가져오기위해
		return num;
	}
	
	public void setCarNum() { //num의 정보를 받아오기위해 
		this.carNum = num; //num의 주소를 carNum을 통해 가리킴
	}
}
