package EQ;

public class Q1 {

	public static void main(String[] args) {
		
		int snail[][]= new int [4][4];//달팽이 배열
		int n;//달팽이의 차수
		int row,col;//행 열
		int k=0;//달팽이 안쪽으로 들어갈 수록 감소되는 행,열 만큼 깍아줄 변수
		int i =1;//달팽이 배열에 넣을 숫자

		for(n=4; n>0;n-=2){//달팽에 차수에 따라 몇번 반복할지
			for(col=0;col<n;col++){
				snail[k][k+col]=i;
				i++;
			}

			for(row=1;row<n;row++){
				snail[k+row][4-k-1]=i;
				i++;
			}

			for(col=1;col<n;col++){
				snail[k+row-1][4-k-col-1]=i;
				i++;
			}

			for(col=1;col<n-1;col++){
				snail[4-k-col-1][k]=i;
				i++;
			}   

			k++;

		}

		for(row=0;row<4;row++){
			for(col=0;col<4;col++){
				System.out.printf("%3d",snail[row][col]);
			}
			System.out.println("");
		}
	} 
}
