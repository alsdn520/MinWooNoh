package EQ;

public class ScopeDemo2 {

	static int i;//��������(�۷ι�����)
	
	static void a() {//�޼ҵ� a
		int i = 0;//��������(���ú���)
	}
	
	public static void main(String[] args) {
		
		for( i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}

	}

}
