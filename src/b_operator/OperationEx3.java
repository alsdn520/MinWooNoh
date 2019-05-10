package b_operator;

public class OperationEx3 {

	public static void main(String[] args) {
	/*	int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);

		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); 
		
		System.out.println("----------------------------------------");
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);*/
//		int num1 = 10;
//		int num2 = 2;
//		
////		num2 *= num1;
//		num1 *=num2;
//		
//		System.out.println(num1);
//		System.out.println(num2);

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
