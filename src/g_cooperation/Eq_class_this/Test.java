package g_cooperation.Eq_class_this;

public class Test {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Jun");
		
		//1 get메소드 출력
		System.out.println(st.getName());
		//2 참조변수 출력
		System.out.println(st);
		//3 메서드 호출
		st.printThis();
		
//setName의 매개변수로 전달된 "Jun"이 전달 되었다.
//이 때 setName 메소드의 코드 구현부의 this는 인스턴스가 되입되는것이다.
//따라서 코드 구현부는 st.name = "Jon" 이 되는것이다.

//stu를 출력하고 this를 출력하는 PrintThis() 메소드를 호출한 결과는 같다.
//1,3번은 인스턴스가 저장된 힙 메모리에 주소값을 가지기 떄문이다.


	}

}
