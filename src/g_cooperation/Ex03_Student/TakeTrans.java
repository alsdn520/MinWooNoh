package g_cooperation.Ex03_Student;

public class TakeTrans {

	public static void main(String[] args) {
		Student st1 = new Student("������",10000);
		Student st2 = new Student("������",5000);
		Student st3 = new Student("Edeard", 50000);
		
		Bus bus271 = new Bus(271);
		st1.takeBus(bus271); //st1 �л��� ������ Ž
		st1.showInfo();    //�л����� ���
		bus271.showInfo(); //�������� ���
		
		Subway subway2 = new Subway("2ȣ��");
		st2.takeSubway(subway2);
		st2.showInfo();
		subway2.showInfo();
		
		taxi taxi = new taxi();
		st3.takeTaxi(taxi);
		st3.showInfo();
		taxi.showInfor();
		
	}

}
