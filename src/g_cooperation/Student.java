package g_cooperation;

public class Student {
	
	public String studentName; //학생이름
	public int grade; //학년
	public int money; //돈
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}//학생 생성자
	
	public void takeBus(Bus bus){
		bus.take(1000);//학생이 내야하는 버스요금
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}//지하철 요금
	
	public void showInfo() {
		System.out.println(studentName+"의 남은돈은"+money+"입니다.");
	}//학생정보
}
