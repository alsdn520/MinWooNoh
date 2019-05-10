package e_constructor;

public class PersonTest {	
	
	public static void main(String[] args) {
		//디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person personNo = new Person(); // Person클래스에 디폴트생성자가 없으면 오류가난다.
		personNo.name = "노민우";
		personNo.height = 181.2f;
		personNo.weight = 78.0f;
		
		//인스턴트 변수 초기와하여 동시에 클래스 생성
		Person personLee = new Person("이순신",175,75);
		
		System.out.println(personNo);//주소값(해쉬코드)만 가르킴
		System.out.println(personLee);//주소값(해시코드)만 가르킴
		
		System.out.println(personNo.name);
		System.out.println(personLee.name);
	}

}
