package g_cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		//학생두명 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);   //버스번호
		studentJames.takeBus(bus100);//james가 100번버스를 탐
		studentJames.showInfo();     //james정보출력
		bus100.showInfo();           //버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");//지하철 노선
		studentTomas.takeSubway(subwayGreen);   //지하철호선
		studentTomas.showInfo();				//학생정보
		subwayGreen.showInfo();					//버스정보		
		
	}
}
