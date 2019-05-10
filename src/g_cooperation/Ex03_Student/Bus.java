package g_cooperation.Ex03_Student;

public class Bus {
	int busNum;			//버스 번호
	int passengerCount; //승객수
	int money; 			//버스 돈
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) { //버스 타는사람당 돈 증가
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스"+busNum+"번의 승객은 "+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}
