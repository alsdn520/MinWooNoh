package EQ;

public class ScopeDemo5 {

	static int i = 0;
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);

	}

}
