package g_cooperation.Ex03_Student;

public class Subway {
	String lineNumber; //버스호선
	int passengerCount; //승객수
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money; //수입증가
		passengerCount++;    //승객증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"호선의 승객은 "+passengerCount+"명 이며, 수입은 "+money+"입니다.");
	}
}
