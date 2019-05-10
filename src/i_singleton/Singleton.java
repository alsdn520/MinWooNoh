package i_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();//null
	
	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}
	
	public static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
}
