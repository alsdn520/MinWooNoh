package g_cooperation.Eq_class_this;

public class Test2 {

	public static void main(String[] args) {
		Student2 st2 = new Student2();
		System.out.println(st2);
		System.out.println(st2.returnSelf());

	}
}
/* 이 경우처럼 this가 쓰이는 경우는 흔치 않다.
 * 하지만 세 가지 방법에 통용되는 원리는 단 하나다. 
 * this라는 것은 인스턴스가 만들어 졌을 때 
 * 생겼을 주소값을 저장하여 자신을 가르키는 역할을 한다는 것만 기억하면 된다.
 */
