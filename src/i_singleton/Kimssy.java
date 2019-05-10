package i_singleton;

public class Kimssy {
	String name;
	int money;
	
	//고객의 이름과 남은돈을 매개변수로 받음
	/* 매개변수란 
	 * 함수에 값을 전달하는 변수를 나타낸다. 함수에 변수를 전달하는 목적은 크게 3가지로 구분된다.
	 * 해당 함수에 값을 전달하기 위한 목적
	 * 해당 함수에서 결과값을 받아오기 위한 목적
	 * 해당 함수에 값을 전달하고 값을 받아오기 휘한 목적
	 * 
	 * 위와 같은 목적은 함수가 변수를 변경시킬 수 있는지에 따라 달라진다 
	 * JAVA에서 변수의 타입은 값을 전달만 할수 있기 때문이다.
	 */
	public Kimssy(String name,int money) {
		this.name = name;
		this.money = money;
		
	}
}
