package EQ;

public class ScopeDemo2 {

	static int i;//전역변수(글로벌변수)
	
	static void a() {//메소드 a
		int i = 0;//지역변수(로컬변수)
	}
	
	public static void main(String[] args) {
		
		for( i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}

	}

}
