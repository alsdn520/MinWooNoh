package e_classpart;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping s = new Shopping();
		
		s.Order_Number = 201803120001L;
		s.id = "abc123";
		s.StartDay = "2018�� 3�� 12��";
		s.Order_Name = "ȫ���";
		s.Product_Number = "PD0345-12";
		s.add = "����� �������� ���ǵ��� 20����";
		
		System.out.println(s.Order_Name);
		System.out.println(s.id);
		System.out.println(s.StartDay);
		System.out.println(s.Order_Name);
		System.out.println(s.Product_Number);
		System.out.println(s.add);
	}

}
