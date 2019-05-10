package g_cooperation.Ex03_Student;

public class Student{
	 String name;
	 int grade;
	 int money;
	 
	 public Student(String name, int money) {
		 this.name = name;
		 this.money = money;
	 }
	 
	 public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	 }
	 public void takeSubway(Subway subway) {
		 subway.take(1500);
		 this.money -= 1500;
	 }
	 public void takeTaxi(taxi taxi) {
		 taxi.take(10000);
		 this.money -= 10000;
	 }
	 
	 public void showInfo() {
		 System.out.println(name+"´ÔÀÇ ³²Àº µ·Àº "+money+" ¿ø ÀÔ´Ï´Ù.");
	 }
}

