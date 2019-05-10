package i_singleton;
/* 1단계 : 생성자를 private로 만든다.
 * 2단계 : 클래스 내부네 static으로 유일한 인스턴스 생성하기.
 * 3단계 : 외부에서 참조할 수 있는 public 메서드 만들기.
 */
public class Company {
	private static Company instance = new Company();//유일하게 생성한 인스턴스
	private Company( ) {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}//instance가 null이라면 new를 생성한다.
		return instance;//유일하게 생성한 instance반환
	}//인스턴스를 외부에서 참조할 수 있도록 public get()메서드 구현
	//즉, 외부에서 getInstance를 호출한다면 null이 
	//아니므로 하나의 instance만 리턴된다.
}
