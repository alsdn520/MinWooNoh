package g_cooperation.ex_bus;

public class Bus {
	int busNum;    //버스 번호
	int intake = 0;    //버스타는 가격
	int passenger; //승객수
	
	public Bus(int num) {
		this.busNum = num;
	}
	
	public void take(int passenger) {
		this.passenger++;
		this.intake += 1000;
	}
	
	public int getBusNum() {
		return busNum;
	}
	
	public int getIntake() {
		return intake;
	}
	public int getPassenger() {
		return passenger;
	}
	public void showInfo() {
		System.out.println("Bus "+this.getBusNum()+" got "
	+this.getPassenger()+" passengers and earned "+ this.getIntake()+" won ");
		//Bus 100 got 1 passengers and earned 1000 won
		//100번 버스는 승객1명 그리고 1000원을 얻었다.
	}
}
