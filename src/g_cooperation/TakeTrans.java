package g_cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		//�л��θ� ����
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);   //������ȣ
		studentJames.takeBus(bus100);//james�� 100�������� Ž
		studentJames.showInfo();     //james�������
		bus100.showInfo();           //���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��");//����ö �뼱
		studentTomas.takeSubway(subwayGreen);   //����öȣ��
		studentTomas.showInfo();				//�л�����
		subwayGreen.showInfo();					//��������		
		
	}
}
