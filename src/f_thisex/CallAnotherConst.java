package f_thisex;

class Person{
	String name;
	int age;


	Person(){
//		this.name = "noname";
		this("이름없음",1); //this를 이용해 Person()생성자 호출
	}
	
	Person(String name, int age){
	  this.name = name;
	  this.age = age;
	}
	
	Person returnItSelf() {
		return this;//this반환
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf();//this 값을 클래스변수에 대입.
		System.out.println(p);			 //noName.returnltSelf()의 반환값 출력
		System.out.println(noName);		 //참조 변수 출력
	}

}
