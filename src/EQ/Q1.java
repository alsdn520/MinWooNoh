package EQ;

public class Q1 {

	public static void main(String[] args) {
		
		int snail[][]= new int [4][4];//������ �迭
		int n;//�������� ����
		int row,col;//�� ��
		int k=0;//������ �������� �� ���� ���ҵǴ� ��,�� ��ŭ ����� ����
		int i =1;//������ �迭�� ���� ����

		for(n=4; n>0;n-=2){//���ؿ� ������ ���� ��� �ݺ�����
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
