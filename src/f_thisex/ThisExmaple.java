package f_thisex;

class BrithDay{
	int day;
	int month;
	int year;
	public void setYear(int year) {
		this.year = year;//bDay.yrer = year; �� ����
	
	}//�¾ ������ �����ϴ� �޼��� 
	public void printThis() {
		System.out.println(this);
	}//this�� ����ϴ� �޼���.
}



public class ThisExmaple {

	public static void main(String[] args) {
		BrithDay bDay = new BrithDay();
		bDay.setYear(2000);			//�¾ �⵵�� 2000���� ����
		System.out.println(bDay);	//�������� ���
		bDay.printThis();			//this ��¸޼��� ȣ��
//		System.out.println(bDay.year);
	}

}
