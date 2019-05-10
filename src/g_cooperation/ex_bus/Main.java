package g_cooperation.ex_bus;

public class Main {

	public static void main(String[] args) {
		Student st = new Student("Min",10000);
		
		Bus bus603 = new Bus(603);//603번버스
		Subway subway2 = new Subway(2);
		Subway subway9 = new Subway(9);
		
		st.takeBus(bus603);     //1000원
		st.takeSubway(subway2); //1500원
		st.takeSubway(subway9); //1500원
		
		st.showInfo();
		bus603.showInfo();
		subway2.showInfo();
		subway9.showInfo();
		
	}

}
