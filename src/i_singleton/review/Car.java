package i_singleton.review;

public class Car {
	//���óѹ� �ڵ� �ο�
	public static int Num = 10000;
	int carNum;
	
	public Car() {
		Num++;
		carNum = Num;
	}
	
}
