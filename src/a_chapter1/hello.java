package a_chapter1;
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
//		
//		System.out.print("Hello World");
//	
		
		
		  Scanner in = new Scanner(System.in);
	      System.out.print("2�� �� �������� ���ұ��? ");
	      int n = in.nextInt();
	      
	      int a;
	      int sum=1;
	      
	      for(a = 0; a <= n; a++) {
	         if(a!=0)
	    	  sum *= 2;
//	    	 System.out.printf("2�� %d���� = ", a); 
	         System.out.println(sum);
	         
	      }
		
//		for(a = 0, sum = 1; a <= n; a++) {
//	         if (a != 0)
//	            sum = sum * 2;
//	            System.out.printf("2�� %d����: ", a);
//	            System.out.println(sum);
//	      }
		   }

		
	}
		
		
