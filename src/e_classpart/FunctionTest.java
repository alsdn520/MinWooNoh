package e_classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
	 int result = add(num1, num2);		 
		System.out.println(num1+"+"+num2+"="+result+"입니다.");
		result = minus(num1, num2);
		System.out.println(num1+"-"+num2+"="+result+"입니다.");
		result = multiplication(num1, num2);
		System.out.println(num1+"*"+num2+"="+result+"입니다.");
		result = division(num1, num2);
		System.out.println(num1+"/"+num2+"="+result+"입니다.");

	}
	
	static int add(int n1, int n2) {
		int result = n1+n2;
	
		return result;
	}
	static int minus(int n1, int n2) {
		int result = n1-n2;
	
		return result;
	}
	static int multiplication(int n1, int n2) {
		int result = n1*n2;
		
		return result;
	}
	static int division(int n1, int n2) {
		int result = n1-n2;
		
		return result;
	}

}
