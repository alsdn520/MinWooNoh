package g_cooperation;

public class Bus {
	int busNaumber;  //버스번호
	int passgerCount;//승객 수
	int money;       //버스 수입
	
	public Bus(int busNaumber) {
		this.busNaumber = busNaumber;
	}//버스 번호를 매개변수로 받는 생성자
	
	public void take(int money) {
		this.money = money;
		passgerCount++;
	}//승객이 버스에 탄 경우를 구현
	
	public void showInfo() {
		System.out.println("버스" + busNaumber + "버스승객은"+passgerCount+"명이고 수입은"+money+"입니다." );
	}
}
