package d_loopexample;

public class Q1_ifelse {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
	
		if(operator == '+') {
			result = num1 + num2;
			System.out.println(num1+"+"+num2+"="+result);
		}else if(operator == '-') {
			result = num1 - num2;
			System.out.println(num1+"-"+num2+"="+result);
		}else if(operator == '*') {
			result = num1 * num2;
			System.out.println(num1+"*"+num2+"="+result);
		}else if(operator == '/') {
			result = num1 / num2;
			System.out.println(num1+"/"+num2+"="+result);
		}
	}
}
