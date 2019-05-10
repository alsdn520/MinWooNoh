package g_cooperation.Ex03_Student;

public class TakeTrans {

	public static void main(String[] args) {
		Student st1 = new Student("동글이",10000);
		Student st2 = new Student("세글이",5000);
		Student st3 = new Student("Edeard", 50000);
		
		Bus bus271 = new Bus(271);
		st1.takeBus(bus271); //st1 학생이 버스를 탐
		st1.showInfo();    //학생정보 출력
		bus271.showInfo(); //버스정보 출력
		
		Subway subway2 = new Subway("2호선");
		st2.takeSubway(subway2);
		st2.showInfo();
		subway2.showInfo();
		
		taxi taxi = new taxi();
		st3.takeTaxi(taxi);
		st3.showInfo();
		taxi.showInfor();
		
	}

}
