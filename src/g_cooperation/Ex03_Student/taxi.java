package g_cooperation.Ex03_Student;

public class taxi {
	int money;
	
	public void take(int money) {
		this.money += 10000;
	}
	
	public void showInfor() {
		
		System.out.println("택시 요금은 " + money +"입니다.");
	}
}
