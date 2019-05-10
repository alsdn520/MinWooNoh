package d_loopexample;

public class Q2_gugudan {
 public static void main(String[] args) {
//	 int i = 0;
//	 int j = 0;
 
/*	 for(i=2;i <=9; i++ ) {
		 for(j=1; j<=9; j++) {
			 if(((i*j)%2)==0) {
				 System.out.println(i+"*"+j+"="+i*j);
			 }
		 }
		 System.out.println();
	 }*/
//	 for(i=2;i <=9; i++ ) {
//		 if(i%2!=0) continue; 
//		 for(j=1; j<=9; j++) {
//				 System.out.println(i+"*"+j+"="+i*j);
//		 }
//		 System.out.println();
//	 }
//	 
	 int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++){
			if (dan %2 != 0) continue;
			for(times = 1; times <=9; times++){
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
 }
}
