package g_cooperation.ex_bus;

public class Student {
	String name;
	int money;
	//학생 정보
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//학생이 버스탈때 요금
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1);
	}
	//지하철 탈때 요금
	public void takeSubway(Subway subway) {
		this.money -=1500;
		subway.take(1);
	}
	
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	public void showInfo() {
		System.out.println(this.getName()+" has "+this.getMoney());
	}
	
}
