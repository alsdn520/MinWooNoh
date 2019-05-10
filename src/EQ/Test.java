package EQ;



public class Test {

	void divide(int num1, int num2) {
	 if(num2 == 0) {
		 System.out.println("나누는 소수는 0이 될수 없다.");
		 return; //함수 수행 종료
	 }else {
		 int result = num1/num2;
		 System.out.println((num1 + "/" + num2 + "=" + result + "입니다."));
	 }
	 
	}
	
}

