package a_chapter1;
/**
 * 파일명 : comment
 *      javadoc 형태의 주석 처리에 사용 
 *
 */
/* 자바 기본프로그램 구조
 * public class 클래스면 {
 *  변수정의    
 *  
 *   - 변수란 프로그래머가 메모리상의 데이터에 접근하기 위한 방법
 *   실제 데이터를 의미하는 변수를 통해 메모리상의 데이터에 접근 가능함.
 *   (한가지 유형의 데이터만 저장할 수 잇고, 각 변수가 저장 할 수 있는 데이터 유형이 정해져 있음.
 *   - 기본형과 참조형이 존재한다.
 *   변수선언
 *   -자바 가상머신(JVM)에게 데이터를 저장하기위한 메모리 할당을 요청하는 것
 *    ->데이터가 필요로 하는 크기의 메모리 할당을 위해 데이터 타입을 명시해야한다.
 *    
 *    데이터 타입 (하나이상의 공백) 변수명;
 *    int var; 변수선언
 *    var = 25; //변수초기화
 *            
 *
 *  메서드 정의 
 *  }//클래스 정의(선언)
 *  
 *  자바에서 클레스는 자바 프로그램의 최소 구성 단위로, 선언된 클래스 내부에 실행에 필요한 
 *  변수나 메서드 등이 정의된다. 이때 자바 코드는 클래스 블록( {} )안에 작성하게된다.
 */
/* 자바는 바이트코드로 번역된 후에 바로 실행할 수 있는 일반 프로그 램으로써
 * 클래스 내에 "java"라는 명령어로 프로그램을 실행할 때 자동으로 호출되어 프로그램을 시작하는 
 * main()메서드를 가지고 있어야 한다.
 */
public class Firs { //class영역의 시작
	int sum; //전역(global)변수 클래스 선언부 밑에 선언된 변수(여러메서드에서 공통으로 사용 가능)
	boolean win; //인스턴스변수
	
	public void add(int javaScore) {// 지역(local) 변수
		javaScore = 5;
		int score = javaScore;//지역(local)변수
		if(score > 10) {
			win = true;
		}
	}
	public void printWinner() {
		if (win == true){
			System.out.println("이기다");
		}else {
			System.out.println("지다.");
		}
	}
//public은 Firs class를 외부에 공개했다는 뜻이다.
	public static void main(String[] args) { //메서드 영역의 시작
		//main(String[] args은 프로그램을 시작하여 특정 작업을 수행함.
		Firs n = new Firs();
		
	    n.printWinner();
		
		System.out.println();
		//System 클래스
		//out 변수
		//println 메서드
		
		byte b1 = 127;
		char c1 = '가';
		int i1;
		double d1;
		System.out.println("자동 형변환의 결과");
		
		i1 = c1; //byte를 int형으로 형변환 하는 경우로써
		         //127이라는 값이 1byte에서 4byte로 표현됨
		System.out.println("i1 = c1의 형변환" + i1);
		
		i1 = c1; //char의 '가'를 int형으로 형변환하면,
		         //'가'를 유니코드로 표현한 십진수의 값(44032)이 int 데이터인 i1에 저장됨
		System.out.println("i1 = c1의 형변환"+i1);
		
		d1 = i1; //int 데이터를 double로 형변환하면 정수가 실수로 변환되어,
		         //i1에 저장되었던 44032라는 값이 44032.0 8바이트 실수로 전환되어 저장됨
		System.out.println("d1 = i1의 형변환" + d1);
		
		System.out.println("******************************");
		
		byte b2 = 127;
		char c2 = '가';
		int i2 = 128;
		int i3 = 97;
		double d2 = 3.14;
		System.out.println("명시적 형변환의 결과");
		b2 = (byte)i2; //int 데이터를 byte형으로 명시적 형변환한 경우로,
		               //byte 128을 표현할 수 없으므로 전혀다른 값, -128이 b2에 저장된다. 
		System.out.println("b2 = (byte)i2의 형변환" + b2);
		
		c2 = (char)i3; //97이라는 int형 데이터를 char 형으로 명시적 형변환한 경우로,
		               //97을 유니코드로 하는 문자인 소문자 a가 c1에 저장됨.
		System.out.println("c2 = (char)i3의 형변환"+c2);
		
		i2 = (int)d1; //int double 데이터를 int데이터로 명시적 형변환하여
		              //3.14의 소수점 아래를 제외한 정수부분만을 i1변수에 저장함
		System.out.println("d1 = i1의 형변환" + i2);
	
	}// 메서드영역의 종료
}//클래스 영역의 종료
