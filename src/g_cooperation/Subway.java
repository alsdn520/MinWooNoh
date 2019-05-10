package g_cooperation;

public class Subway {
	String lineNumber;//지하철 노선
	int passengerCont;//승객수
	int money;
	
	public Subway(String lineNuber) {
		this.lineNumber = lineNuber;
	}//지하철 노선을 매개변수로 받는 생성자.
	
	
	public void take(int money) {//승객이 지하철에 탄경우
		this.money = money;
		passengerCont++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은"+passengerCont+"명이며, 수입은"+money+"입니다.");
	}
}
