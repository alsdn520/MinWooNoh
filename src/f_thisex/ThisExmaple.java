package f_thisex;

class BrithDay{
	int day;
	int month;
	int year;
	public void setYear(int year) {
		this.year = year;//bDay.yrer = year; 와 같음
	
	}//태어난 연도를 저장하는 메서드 
	public void printThis() {
		System.out.println(this);
	}//this를 출력하는 메서드.
}



public class ThisExmaple {

	public static void main(String[] args) {
		BrithDay bDay = new BrithDay();
		bDay.setYear(2000);			//태어난 년도를 2000으로 지정
		System.out.println(bDay);	//참조변수 출력
		bDay.printThis();			//this 출력메서드 호출
//		System.out.println(bDay.year);
	}

}
