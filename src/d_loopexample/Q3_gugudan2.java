package d_loopexample;

public class Q3_gugudan2 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		for(i = 2; i <= 9; i++) {
			for(j=1; j<=9; j++) {
//				if(j>i) break;
				if(i>=j)
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	
	}
}
