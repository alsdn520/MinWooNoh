package g_cooperation.ex_bus;

public class Student {
	String name;
	int money;
	//�л� ����
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//�л��� ����Ż�� ���
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1);
	}
	//����ö Ż�� ���
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
