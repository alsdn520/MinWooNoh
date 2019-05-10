package i_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();//null
	
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}
	
	public static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
}
