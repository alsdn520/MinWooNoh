package d_loopexample;

public class BreakExample2 {
 public static void main(String[] args) {
	 
	 int num = 0;
	 int sum = 0;
	 
//	 for(num = 0; ;num++) {
//		 sum +=num;
//		 if(sum >= 100) {
//			 break;
//		 }
//		 
//	 }
//	 System.out.println("num:"+num);
//	 System.out.println("sum:"+sum);
	 
	 for(num = 0; ; num++) {
		 sum +=num;
		 if(sum >=100)
			 break;
	 }
	 System.out.println("num:"+num);
	 System.out.println("sum:"+sum);
 }
}
