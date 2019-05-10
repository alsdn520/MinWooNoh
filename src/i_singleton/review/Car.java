package i_singleton.review;

public class Car {
	//차련넘버 자동 부여
	public static int Num = 10000;
	int carNum;
	
	public Car() {
		Num++;
		carNum = Num;
	}
	
}
