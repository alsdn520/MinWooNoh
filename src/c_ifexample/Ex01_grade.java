package c_ifexample;

public class Ex01_grade {
 public static void main(String[] arge) {
	 
	 int score = 91;
	 char grade;
	 
	 if(score <= 100 && score >= 90) {
		 grade = 'A';
	 }else if(score <= 89 && score >= 80) {
		 grade = 'B';
	 }else if(score <= 79 && score >= 70) {
		 grade = 'C';
	 }else if(score <= 69 && score >= 69) {
		 grade = 'D';
	 }else {
		 grade = 'F';
	 }
	 System.out.println("학점은"+grade+"입니다" );
 }
}
