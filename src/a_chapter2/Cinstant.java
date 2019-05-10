package a_chapter2;

public class Cinstant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;//선언과 동시에 초기화.
		final int MIN_NUM;
		
		MIN_NUM = 0;//사용하기 전에 초기화를 해 주는것이 좋다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
//        MIN_NUM = 1000; //(오류) 상수값은 변경 불가
	}

}
