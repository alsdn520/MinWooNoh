package b_operator;

class R{
	static String color = "white";
	int volume = 5;
	boolean power = false;
}

public class OperationEx4 {

	static int x = 10;
	
	public static void main(String[] args) {
		
		System.out.println(R.color);
//		int fatherAge = 45;
//		int motherAge = 47;
//		
//		char ch;
//		ch = (fatherAge > motherAge) ? 'T' : 'F';
//		
//		System.out.println(ch);
		
		R ro = new R();
		ro.power = true;
		System.out.println(ro.power);
	
		int x = 100;
		
		System.out.println(x);
		
	}

}
