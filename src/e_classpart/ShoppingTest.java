package e_classpart;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping s = new Shopping();
		
		s.Order_Number = 201803120001L;
		s.id = "abc123";
		s.StartDay = "2018년 3월 12일";
		s.Order_Name = "홍길순";
		s.Product_Number = "PD0345-12";
		s.add = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(s.Order_Name);
		System.out.println(s.id);
		System.out.println(s.StartDay);
		System.out.println(s.Order_Name);
		System.out.println(s.Product_Number);
		System.out.println(s.add);
	}

}
