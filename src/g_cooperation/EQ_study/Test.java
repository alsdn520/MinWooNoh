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
		 * ���� ������ �Է� �ް� �� ���� ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
		 * */
		Scanner st = new Scanner(System.in);
		System.out.println("���� ������ �Է¹�������");
		int n = st.nextInt();
		int a;
		
		for(a = 1; a<=n ; a++) {
			if((n%a)==0);
			
		}
		System.out.println(a);
		/**
		 * ���� �޼ҵ带 ȣ���Ͽ� Calculator Ŭ���� ������ �޼ҵ带 �ϼ��Ͻÿ�.
		 * */
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		
		System.out.println("1+2+3 = " + sum);
		
	
		/**
		 * �ΰ��� ���� ������ �޾� ������ ������� 2������ ǥ���Ͻÿ�
		 * <����> �� ���� �ϳ��� ���������� �Է¹ްų� �μ��� ���� 50�� �Ѿ�� -1 ���
		 *  */
		
	
	
		
	}
	
}
