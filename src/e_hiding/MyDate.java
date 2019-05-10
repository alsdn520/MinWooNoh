package e_hiding;

import java.util.Calendar;

/* MyDate 클래스 완성하기
 * day, month, year변수는 private로 선언
 * 각 변수의 get,set 메서드는 public로 만든다
 * MyDate(int day, int month, int year) 생성자를 만든다
 * public boolean isValid()메서드를 만들어 날짜가 유요한지 확인한다.
 * MyDateTest  클래스에서 생성한 MyDate 날짜가 유효한지 확인한다. 
 * 1,3,5,7,8,10,12월 31일
 * 4,6,9,11 30일
 * 2 28일
 */
public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	public MyDate(int day, int month, int year){
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		//1,3,5,7,8,10,12월 31일
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			if (day < 0 || day > 31) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
			//4,6,9,11 30일	    
		case 4 : case 6 : case 9 : case 11 :
			if(day < 0 || day > 30) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;	
			//2 28일
		case 2 :
			//윤달일 경우		
			if(( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				if(day < 0 || day > 29) {
					isValid = false;
				}
				else {
					this.day = day;
				}
			//윤년이 아닐경우	
			}
			else {
				if (day < 0 || day > 28) {
					isValid = false;
				}
				else {
					this.day = day;
				}
			
			}
			break;
		default :
			isValid = false;

		}

	}

	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}


	public String isValid() {

		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않는 날짜입니다.";
		}
	}	
}
