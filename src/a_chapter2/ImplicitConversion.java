package a_chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		System.out.println("-----------");
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);

		System.out.println("-----------");
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
