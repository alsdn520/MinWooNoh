package d_loopexample;

public class Q1_switchcase {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		switch(operator) {
		case '+' :
			result = num1+num2;
			break;
		case '-' :
			result = num1-num2;
			break;
		case '*' :
			result = num1*num2;
			break;
		case '/' :
			result = num1/num2;
			break;
			default : 
				System.out.println("오류입니다.");
		}
		System.out.println(num1+"+"+num2+"="+result);
	
	}
}
