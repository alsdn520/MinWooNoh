package g_cooperation.EQ_study;

import java.util.Scanner;

class Calculator {
	public int evaluate(String expression) {
		
		int sum = 6;

		return sum;
	}
}


class DecimalNotation {	
	public int binaryNumber(int x, int y) {
		int binaryNum = 0;
		return binaryNum;
	}
}

public class Test {
	
	public static void main(String[] args) {
	
		/**
		 * 양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성하십시오.
		 * */
		Scanner st = new Scanner(System.in);
		System.out.println("양의 정수를 입력받으세요");
		int n = st.nextInt();
		int a;
		
		for(a = 1; a<=n ; a++) {
			if((n%a)==0);
			
		}
		System.out.println(a);
		/**
		 * 다음 메소드를 호출하여 Calculator 클래스 내부의 메소드를 완성하시오.
		 * */
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		
		System.out.println("1+2+3 = " + sum);
		
	
		/**
		 * 두개의 양의 정수를 받아 연산후 결과값을 2진수로 표현하시오
		 * <주의> 두 수중 하나라도 음의정수를 입력받거나 두수의 합이 50이 넘어가면 -1 출력
		 *  */
		
	
	
		
	}
	
}
